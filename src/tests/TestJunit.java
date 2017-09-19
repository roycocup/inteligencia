package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJunit {



    @Test
    public void junitIsWorking() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }


}