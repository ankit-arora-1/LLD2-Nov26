package prototype2;

import java.util.HashMap;
import java.util.Map;


// Registry design pattern
// This should be singleton
public class VMInstanceRegistry {

    private Map<String, VMInstance> map;

    public VMInstanceRegistry() {
        map = new HashMap<>();
    }


    public VMInstance get(String key) {
        return map.get(key).copy();
    }

    public void set(String key, VMInstance vmInstancePrototype) {
        map.put(key, vmInstancePrototype);
    }

}
