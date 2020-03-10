package structural.facade;

import java.io.File;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface VideoConversionFacade {
    File convertVideo(String fileName, String codec);
}
