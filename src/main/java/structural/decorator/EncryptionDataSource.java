package structural.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class EncryptionDataSource extends DataSourceDecorator {
    public EncryptionDataSource(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        String encodedData = encode(data);
        System.out.println(String.format("encoded data : %s", encodedData));
        super.writeData(encodedData);
    }

    private String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String readData() {
        String decodedData = decode(super.readData());
        System.out.println(String.format("decoded data : %s", decodedData));
        return decodedData;
    }

    private String decode(String readData) {
        return new String(Base64.getDecoder().decode(readData), StandardCharsets.UTF_8);
    }
}
