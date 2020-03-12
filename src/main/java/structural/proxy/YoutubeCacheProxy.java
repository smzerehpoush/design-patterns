package structural.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib thirdPartyYoutubeLib;
    private Map<String, Video> popularCachedVideos = new HashMap<>();
    private Map<String, Video> allCachedVideos = new HashMap<>();

    public YoutubeCacheProxy() {
        this.thirdPartyYoutubeLib = new ThirdPartyYoutubeLibImpl();
    }

    @Override
    public Map<String, Video> popularVideos() {
        if (popularCachedVideos.isEmpty()) {
            popularCachedVideos.putAll(thirdPartyYoutubeLib.popularVideos());
        }
        return popularCachedVideos;
    }

    @Override
    public Video getVideo(String videoId) {
        if (allCachedVideos.containsKey(videoId))
            return allCachedVideos.get(videoId);
        allCachedVideos.put(videoId, thirdPartyYoutubeLib.getVideo(videoId));
        return allCachedVideos.get(videoId);
    }

}
