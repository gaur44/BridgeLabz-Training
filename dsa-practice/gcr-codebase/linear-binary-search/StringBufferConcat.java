public class StringBufferConcat {
    public static String concatenate(String[] strArray) {
        // Using StringBuffer
        StringBuffer cat = new StringBuffer();
        for (String str : strArray) {
            cat.append(str);
        }
        return cat.toString();
    }

    public static void main(String[] args) {
        // String array
        String[] stringArray = {"Hello ", "World", "!"};
        System.out.println(StringBufferConcat.concatenate(stringArray));
    }
}
