public class StringReverser { 
    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(StringReverser.reverse("Hello"));
    }
}