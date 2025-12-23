import java.util.Scanner;

public class FrequencyCharactersNestedLoops {
    
    public static String[] getFrequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }
        
        String[] result = new String[count];
        int index = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter string: ");
        String str = sc.nextLine();
        
        String[] result = getFrequency(str);
        
        System.out.println("character frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        
        sc.close();
    }
}