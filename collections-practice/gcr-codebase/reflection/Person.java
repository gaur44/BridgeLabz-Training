import java.lang.reflect.Field;

public class Person {

    private int age;

    public Person() {
        age = 0;
    }

    public static void main(String[] args) {

        try {
            Person p = new Person();

            Class<?> cls = p.getClass();

            Field field = cls.getDeclaredField("age");
            field.setAccessible(true);

            field.set(p, 22);

            int value = (int) field.get(p);

            System.out.println("Age is: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

