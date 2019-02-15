import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void hasGenre(){
        assertEquals("folk", band.getGenre());
    }

    @Test
    public void startsOffWithNoMembers(){
        assertEquals(0, band.memberCount());
    }
    

}
