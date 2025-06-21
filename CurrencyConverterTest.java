import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    private final CurrencyConverter converter = new CurrencyConverter();

    @Test
    void testUsdToInr() {
        assertEquals(8275.0, converter.convert(100, "USD", "INR"), 0.001);
    }

    @Test
    void testEurToUsd() {
        assertEquals(54.0, converter.convert(50, "EUR", "USD"), 0.001);
    }

    @Test
    void testInrToEur() {
        assertEquals(11.0, converter.convert(1000, "INR", "EUR"), 0.001);
    }

    @Test
    void testInvalidCurrencyCombination() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(100, "USD", "GBP");
        });
    }

    @Test
    void testLowerCaseInput() {
        assertEquals(8275.0, converter.convert(100, "usd", "inr"), 0.001);
    }

    @Test
    void testNegativeAmount() {
        assertEquals(-4482.5, converter.convert(-50, "EUR", "INR"), 0.001);
    }

    @Test
    void testZeroAmount() {
        assertEquals(0.0, converter.convert(0, "INR", "USD"), 0.001);
    }
}
