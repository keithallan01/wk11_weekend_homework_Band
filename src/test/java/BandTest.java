import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BandTest {
    Band band;

    @Before
    public void before(){
        band = new Band("Jimmy Shand Band", "folk");
    }

    @Test
        public void hasName(){
        assertEquals("Jimmy Shand Band", band.getName());
    }
}
