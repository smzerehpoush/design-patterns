package structural.proxy;

import java.util.Map;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface ThirdPartyYoutubeLib {
    Map<String, Video> popularVideos();

    Video getVideo(String videoId);
}
