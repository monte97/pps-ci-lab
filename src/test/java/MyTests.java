import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        // assert statements
        assertEquals(0, 10 * 0);
        assertEquals(0, 0 * 10);
        assertEquals(0, 0 * 0);
    }
}
