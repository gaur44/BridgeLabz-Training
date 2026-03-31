package passwordvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isValid("Password123"));
        assertTrue(validator.isValid("MyPass99"));
    }

    @Test
    public void testTooShort() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    public void testNoUppercase() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("password123"));
    }

    @Test
    public void testNoDigit() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("Password"));
    }

    @Test
    public void testNullPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid(null));
    }
}