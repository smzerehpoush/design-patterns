package structural.decorator;

import java.util.Random;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        String fileName = String.format("file-%s.out",
                new Random(System.currentTimeMillis()).nextInt(1000));
        DataSource dataSource = new LoggerDataSource(
                new EncryptionDataSource(
                        new CompressionDecorator(
                                new FileDataSource(fileName)
                        )
                )
        );
        dataSource.writeData("This Is Test");
        dataSource.readData();
    }
}
