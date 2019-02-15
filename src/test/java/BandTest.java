import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BandTest {
    Band band;
    Musician musician1;
    Musician musician2;
    Musician musician3;
    Song song;


    @Before
    public void before(){
        band = new Band("Jimmy Shand Band", "folk");
        musician1 = new Musician("Kris Drever", InstrumentType.GUITAR);
        musician2 = new Musician("John McCusker", InstrumentType.VIOLIN);
        musician3 = new Musician("Rachel Sermani", InstrumentType.VOCALS);
        song = new Song("Spootiskerry");
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

    @Test
    public void hasBandMembers(){
    band.addMember(musician1);
    band.addMember(musician2);
    band.addMember(musician3);
    assertEquals(3, band.memberCount());
    }

    @Test
    public void canFindMusicianByInstrument(){
        band.addMember(musician1);

    }

//    @Test
//    public void BandCanPlaySong(){
//        band.addMember(musician1);
//        band.addMember(musician2);
//        assertEquals("Spootiskerry", band.playSong());
//    }

}
