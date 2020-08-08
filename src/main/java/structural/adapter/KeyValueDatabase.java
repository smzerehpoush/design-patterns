package structural.adapter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class KeyValueDatabase {
    private Map<String, Object> keyValuePair = new ConcurrentHashMap<>();

    public void store(Map<String, Object> objects) {
        keyValuePair.putAll(objects);
    }

    public void store(String key, Object value) {
        keyValuePair.put(key, value);
    }
}
