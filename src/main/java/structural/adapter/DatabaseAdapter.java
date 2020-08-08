package structural.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class DatabaseAdapter extends KeyValueDatabase {

    public void store(StatisticsResponseModel responseModel) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", responseModel.getId());
        map.put("question", responseModel.getQuestion());
        map.put("answer", responseModel.getAnswer());
        super.store(map);
    }
}
