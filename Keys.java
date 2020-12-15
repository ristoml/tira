import java.util.List;
import java.util.ArrayList;

public class Keys {
    private List<Integer> keys;

    public Keys() {
        keys = new ArrayList<>();
    }
    public void addKey(String value) {
        keys.add(Integer.valueOf(value));
    }
    
}