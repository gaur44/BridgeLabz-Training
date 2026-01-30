package temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);
        assertEquals(37, converter.fahrenheitToCelsius(98.6), 0.01);
    }

    @Test
    public void testNegativeTemperatures() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }
}