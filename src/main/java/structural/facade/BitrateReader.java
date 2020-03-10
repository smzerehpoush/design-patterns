package structural.facade;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class BitrateReader {
    public static VideoFile read(String fileName, Codec sourceCode) {
        VideoFile videoFile = new VideoFile(fileName, sourceCode);
        System.out.println("reading file : " + fileName);
        System.out.println("codec : " + sourceCode);
        return videoFile;
    }

    public static VideoFile convert(VideoFile source, Codec destCode) {
        VideoFile videoFile = new VideoFile(source.getFileName(), destCode);
        System.out.println("converting file : " + source.getFileName());
        System.out.println("codec : " + destCode);
        return videoFile;
    }
}
