package dateformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    @Test
    public void testValidDate() {
        DateFormatter formatter = new DateFormatter();
        assertEquals("15-03-2024", formatter.formatDate("2024-03-15"));
        assertEquals("01-01-2000", formatter.formatDate("2000-01-01"));
    }

    @Test
    public void testInvalidFormat() {
        DateFormatter formatter = new DateFormatter();
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("15-03-2024");
        });
    }

    @Test
    public void testNullDate() {
        DateFormatter formatter = new DateFormatter();
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
}