package tpworkflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSquare() {
        assertEquals(25, Main.square(5));
        assertEquals(0, Main.square(0));
        assertEquals(4, Main.square(-2));
    }
}
