package divider;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DividerTest {

    @Test
    public void testDivide() {
        Divider divider = new Divider();
        assertEquals(2, divider.divide(6, 3));
        assertEquals(-3, divider.divide(9, -3));
    }

    @Test
    public void testDivideByZero() {
        Divider divider = new Divider();
        assertThrows(ArithmeticException.class, () -> {
            divider.divide(10, 0);
        });
    }
}