package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        StringUtils utils = new StringUtils();
        assertEquals("olleh", utils.reverse("hello"));
        assertEquals("", utils.reverse(""));
        assertEquals("a", utils.reverse("a"));
        assertEquals("54321", utils.reverse("12345"));
    }

    @Test
    public void testReverseNull() {
        StringUtils utils = new StringUtils();
        assertNull(utils.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("racecar"));
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(utils.isPalindrome(""));
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome("world"));
    }

    @Test
    public void testIsPalindromeNull() {
        StringUtils utils = new StringUtils();
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    public void testToUpperCase() {
        StringUtils utils = new StringUtils();
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("WORLD", utils.toUpperCase("WoRLd"));
        assertEquals("", utils.toUpperCase(""));
        assertEquals("123ABC", utils.toUpperCase("123abc"));
    }

    @Test
    public void testToUpperCaseNull() {
        StringUtils utils = new StringUtils();
        assertNull(utils.toUpperCase(null));
    }
}