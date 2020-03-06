package structural.adapter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        USB usb = new USBTypeC();
        LightningAdapter lightningAdapter = new LightningAdapter(usb);
        InputStream inputStream = new ByteArrayInputStream("Hello!".getBytes());
        String str = lightningAdapter.readDataFromLightning(inputStream);
        System.out.println(str);
    }
}
