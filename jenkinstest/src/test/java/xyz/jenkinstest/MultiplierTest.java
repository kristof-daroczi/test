package xyz.jenkinstest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import xyz.test.jenkinstest.Multiplier;

public class MultiplierTest {

    private Multiplier multiplier = new Multiplier();

    @Test
    public void testAdderOk() {
        int a = 2;
        int b = 3;
        assertEquals(6, multiplier.multiply(a, b));
    }

    @Test
    public void testAdderNotOk() {
        int a = 2;
        int b = 3;
        assertNotEquals(7, multiplier.multiply(a, b));
    }
}
