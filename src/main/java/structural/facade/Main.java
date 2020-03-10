package structural.facade;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFadeImpl();
        videoConversionFacade.convertVideo("a.mp4", "mkv");
    }
}
