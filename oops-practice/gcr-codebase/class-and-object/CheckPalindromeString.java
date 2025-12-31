public class CheckPalindromeString {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker("racecar");
        palindromeChecker.displayResult();
    }
}

class PalindromeChecker {
    String text;

    // initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // check if the text is a palindrome
    public boolean isStrPalindrome() {
        String trimmed = text.replaceAll("\s+", "").toLowerCase();
        String rev = new StringBuilder(trimmed).reverse().toString();
        return trimmed.equals(rev);
    }

    // display result
    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome: " + isStrPalindrome());
    }
}