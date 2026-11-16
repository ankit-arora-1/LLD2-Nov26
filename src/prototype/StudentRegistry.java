package prototype;

import java.util.HashMap;
import java.util.Map;


// Registry design pattern
// This should be singleton
public class StudentRegistry {

    private Map<String, Student> map;

    public StudentRegistry() {
        map = new HashMap<>();
    }


    public Student get(String key) {
        return map.get(key).copy();
    }

    public void set(String key, Student studentPrototype) {
        map.put(key, studentPrototype);
    }

}
