import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rodderscode.co.uk.Inteligencia;
import rodderscode.co.uk.utils.Parameters;

import static org.junit.Assert.*;

public class TestMain {

    Inteligencia i;

    @Before
    public void setUp() {
        this.i = new Inteligencia();
    }

    @After
    public void tearDown()
    {

    }

    @Test
    public void mainExists()
    {
        assertNotNull(i);
        assertEquals(Inteligencia.class, i.getClass());
    }

    @Test
    public void dataGetterReturnsData()
    {
        String data = i.getDataFrom(Parameters.SOURCE_GOOGLE);
        assertTrue(null != data.toString());
    }

    @Test
    public void confirmApiIsAlive()
    {
        this.i.getDataFrom(Parameters.SOURCE_GOOGLE);
    }
}
