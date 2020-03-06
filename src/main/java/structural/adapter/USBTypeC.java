package structural.adapter;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class USBTypeC implements USB {
    @Override
    public String readDataFromUsb(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        StringBuilder stringBuilder = new StringBuilder();
        int character;
        try {
            while ((character = inputStreamReader.read()) != -1) {
                stringBuilder.append((char) character);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return null;
        }
    }
}
