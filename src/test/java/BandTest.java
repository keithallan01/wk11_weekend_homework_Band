import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BandTest {
    Band band;
    Band band2;
    Musician musician1;
    Musician musician2;
    Musician musician3;
    Song song;


    @Before
    public void before(){
        band = new Band("Jimmy Shand Band", "folk");
        band2 = new Band("Daughter", "Indie");

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
    public void canLearnSong(){
        band.addSong(song);
        assertEquals(1, band.songCount());
    }

    @Test
    public void BandCanPlaySong(){
        band.addMember(musician1);
        band.addSong(song);
//        HashMap<String, ArrayList<Song>> result = band.playSong();
        assertEquals("Spootiskerry", band.playSong());
  }



}
