import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private int age;

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SimpleMapper {

    static <T> T toObject(Class<T> c, Map<String, Object> data) {
        try {
            T obj = c.getDeclaredConstructor().newInstance();

            for (String key : data.keySet()) {
                Field f = c.getDeclaredField(key);
                f.setAccessible(true);
                f.set(obj, data.get(key));
            }
            return obj;

        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {

        Map<String, Object> m = new HashMap<>();
        m.put("name", "Agraj");
        m.put("age", 22);

        Student s = toObject(Student.class, m);
        System.out.println(s);
    }
}

