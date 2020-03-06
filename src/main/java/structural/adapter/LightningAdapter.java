package structural.adapter;

import java.io.InputStream;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class LightningAdapter implements Lightning {
    private USB usb;

    public LightningAdapter(USB usb) {
        this.usb = usb;
    }

    @Override
    public String readDataFromLightning(InputStream inputStream) {
        return usb.readDataFromUsb(inputStream);
    }
}
