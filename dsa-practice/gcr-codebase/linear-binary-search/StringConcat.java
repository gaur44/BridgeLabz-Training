public class StringConcat {
    public static String concatenate(String[] strArray) {
        StringBuilder cat = new StringBuilder();
        for (String str : strArray) {
            cat.append(str);
        }
        return cat.toString();
    }

    public static void main(String[] args) {
        // String array
        String[] stringArray = {"Hello ", "World", "!"};
        System.out.println(StringConcat.concatenate(stringArray));
    }
}
