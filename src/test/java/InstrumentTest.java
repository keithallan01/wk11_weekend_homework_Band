import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("guitar", "Fender", "Telecaster");
    }

    @Test
    public void hasType(){
        assertEquals("guitar", instrument.getType());
    }


}
