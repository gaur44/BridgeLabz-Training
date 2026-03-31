import java.lang.reflect.Field;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SimpleJson {

    static String toJson(Object obj) {
        StringBuilder sb = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        try {
            for (int i = 0; i < fields.length; i++) {
                Field f = fields[i];
                f.setAccessible(true);

                sb.append("\"").append(f.getName()).append("\": ");

                Object val = f.get(obj);
                if (val instanceof String)
                    sb.append("\"").append(val).append("\"");
                else
                    sb.append(val);

                if (i < fields.length - 1)
                    sb.append(", ");
            }
        } catch (Exception e) {
            return "{}";
        }

        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {

        Person p = new Person("Agraj", 22);
        System.out.println(toJson(p));
    }
}

