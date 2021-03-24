package behavioral.strategy.strategy;

import org.json.simple.JSONObject;
import behavioral.strategy.model.Person;

public class Json implements Marshaling {
    @Override
    public void marshal(Person person) {
        JSONObject obj = new JSONObject();
        obj.put("name", person.getName());
        obj.put("family", person.getFamily());
        System.out.print(obj);
    }
}
