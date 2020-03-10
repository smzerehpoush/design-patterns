package structural.facade;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public enum Codec {
    MP4,
    OGG,
    MKV;

    public static Codec get(String fileName) {
        return Codec.valueOf(fileName.substring(fileName.lastIndexOf(".") + 1).toUpperCase());
    }
}
