package structural.facade;

import java.io.File;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class AudioMixer {
    public static File mix(VideoFile file) {
        return new File(file.getFileName());
    }
}
