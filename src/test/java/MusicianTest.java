import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicianTest {

    Musician musician;

    @Before
    public void before(){
        musician = new Musician("Jimmy Shand", InstrumentType.ACCORDION);
    }

    @Test
    public void hasNAme(){
        assertEquals("Jimmy Shand", musician.getName());
    }
}
