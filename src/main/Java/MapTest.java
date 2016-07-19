import java.util.HashMap;
import java.util.Map;

/**
 * Created by cdanial on 15.07.2016.
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("key1", "Value for key one");
        map.put("key2", "Value for key two");

        System.out.println(map.get("key1"));
    }
}
