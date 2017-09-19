import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.Parameters;

import static org.junit.Assert.*;

public class TestMain {

    Inteligencia main;

    @Before
    public void setUp() {
        this.main = new Inteligencia();
    }

    @After
    public void tearDown()
    {

    }

    @Test
    public void mainExists()
    {
        assertNotNull(main);
        assertEquals(Inteligencia.class, main.getClass());
    }

    @Test
    public void setUrlViaSource()
    {
        String[] urls = {"http://duckduckgo.com", "http://google.co.uk", "http://bing.com"};

        this.main.setUrl(Parameters.SOURCE_GOOGLE);
        assertNotEquals(urls[0],main.getUrl());
        assertNotEquals(urls[2],main.getUrl());
        assertEquals(urls[1], main.getUrl());

        this.main.setUrl(Parameters.SOURCE_BING);
        assertNotEquals(urls[0],main.getUrl());
        assertNotEquals(urls[1],main.getUrl());
        assertEquals(urls[2], main.getUrl());

        this.main.setUrl(Parameters.SOURCE_DUCK);
        assertNotEquals(urls[1],main.getUrl());
        assertNotEquals(urls[2],main.getUrl());
        assertEquals(urls[0], main.getUrl());

    }


}
