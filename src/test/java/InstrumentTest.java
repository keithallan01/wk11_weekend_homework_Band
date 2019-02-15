import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void hasManufacturer(){
        assertEquals("Fender", instrument.getManufacturer());
    }
}
