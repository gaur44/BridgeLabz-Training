import java.util.Scanner;

public class MostFrequentCharacterFinder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter a string: ");
        String input = scanner.nextLine();
        
        char mostFrequent = getMostFrequentChar(input);
        
        System.out.println("most frequent character: '" + mostFrequent + "'");
        
        scanner.close();
    }
    
    public static char getMostFrequentChar(String str) {
        int[] freq = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        
        char mostFrequent = str.charAt(0);
        int maxCount = freq[mostFrequent];
        
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }
        
        return mostFrequent;
    }
}

