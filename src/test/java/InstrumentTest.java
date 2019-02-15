import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument(InstrumentType.GUITAR, "Fender", "Telecaster");
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.GUITAR, instrument.getType());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Fender", instrument.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Telecaster", instrument.getModel());
    }
}
