import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        // assert statements
        assertEquals(0, 10 * 0, "10 x 0 must be 0");
        assertEquals(0, 0 * 10, "0 x 10 must be 0");
        assertEquals(0, 0 * 0, "0 x 0 must be 0");
    }
}
