package xyz.jenkinstest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import xyz.test.jenkinstest.Adder;


public class AdderTest {

    private Adder adder=new Adder();

    @Test
    public void testAdderOk() {
        int a = 2;
        int b = 3;
        assertEquals(5, adder.add(a, b));
    }
    
    @Test
    public void testAdderNotOk() {
        int a = 2;
        int b = 3;
        assertNotEquals(6, adder.add(a, b));
    }
}
