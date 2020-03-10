package structural.facade;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class VideoFile {
    private String fileName;
    private Codec codec;


    public VideoFile(String fileName, Codec codec) {
        this.fileName = fileName;
        this.codec = codec;
    }

    public String getFileName() {
        return fileName;
    }

    public Codec getCodec() {
        return codec;
    }
}
