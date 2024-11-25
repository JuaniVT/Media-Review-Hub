import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class DataManager<T extends Item> {

    private ArrayList<T> collection;

    public DataManager() {
        this.collection = new ArrayList<>();
    }

    private void add_Element(T element) {
        collection.add(element);
    }

    private void delect_element(T element) {
        collection.remove(element);
    }


    public JSONArray toJSONArray() {

        JSONArray json = new JSONArray();

        for (int i = 0; i < json.length(); i++) {
            json.put(collection.get(i).toJSON());
        }
        return json;
    }
}
