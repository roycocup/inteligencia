import com.oracle.javafx.jmx.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.Cacher;
import utils.DataFetcher;
import utils.Parameters;

import static org.junit.Assert.*;

public class TestMain {

    Inteligencia main;

    @Before
    public void setUp() {
        this.main = new Inteligencia();
    }

    @After
    public void tearDown() {}

    @Test
    public void weHaveADataFetcher()
    {
        assertNotNull(this.main.dataFetcher);
        assertEquals(DataFetcher.class, this.main.dataFetcher.getClass());
    }

    @Test
    public void weHaveADataCacher()
    {
        assertNotNull(this.main.cacher);
        assertEquals(Cacher.class, this.main.cacher.getClass());
    }



}
