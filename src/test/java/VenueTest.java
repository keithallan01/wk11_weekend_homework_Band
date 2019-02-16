import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VenueTest {
    Venue venue;
    Band band;
    Musician musician1;
    Musician musician2;
    Musician musician3;
    Song song;
    Person person;

    @Before
    public void before(){
        venue = new Venue("Sneaky Pete's", 3);
        band = new Band("Jimmy Shand Band", "folk");
        musician1 = new Musician("Kris Drever", InstrumentType.GUITAR);
        musician2 = new Musician("John McCusker", InstrumentType.VIOLIN);
        musician3 = new Musician("Rachel Sermani", InstrumentType.VOCALS);
        song = new Song("Spootiskerry");
        person = new Person();
    }

    @Test
    public void venueHasName(){
        assertEquals("Sneaky Pete's", venue.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, venue.getCapacity());
    }

    @Test
    public void venueStartsOffEmpty(){
        assertEquals(0, venue.audienceCount());
    }

    @Test
    public void venueCanAddPeople(){
        venue.addPerson(person);
        venue.addPerson(person);
        venue.addPerson(person);
        venue.addPerson(person);
        assertEquals(3, venue.audienceCount());
    }

    @Test
    public void venueStartsOffWithNoBands(){
        assertEquals(0, venue.bandCount());
    }

    @Test
    public void canAddBand(){
        venue.addBand(band);
        assertEquals(1, venue.bandCount() );
    }

    @Test
    public void canRemovePerson(){
        venue.addPerson(person);
        assertEquals(1, venue.audienceCount());
        venue.removePerson();
        assertEquals(0, venue.audienceCount());
    }


}
