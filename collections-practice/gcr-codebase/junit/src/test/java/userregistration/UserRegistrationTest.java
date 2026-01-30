package userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    public void testValidRegistration() {
        UserRegistration reg = new UserRegistration();
        assertTrue(reg.registerUser("john", "john@email.com", "pass123"));
    }

    @Test
    public void testInvalidUsername() {
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("ab", "test@email.com", "pass123");
        });
    }

    @Test
    public void testInvalidEmail() {
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("john", "invalidemail", "pass123");
        });
    }

    @Test
    public void testInvalidPassword() {
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("john", "john@email.com", "123");
        });
    }
}