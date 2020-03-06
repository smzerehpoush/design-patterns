package structural.adapter;

import java.io.InputStream;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface USB {
    String readDataFromUsb(InputStream inputStream);
}
