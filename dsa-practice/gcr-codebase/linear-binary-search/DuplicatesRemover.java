import java.util.HashSet;
import java.util.Set;

public class DuplicatesRemover {
    public static String removeDuplicates(String string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < string.length(); i++) {
            if (!set.contains(string.charAt(i))) {
                sb.append(string.charAt(i));
            }
            set.add(string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String unique = DuplicatesRemover.removeDuplicates("Hellloo");
        System.out.println(unique);
    }
}
