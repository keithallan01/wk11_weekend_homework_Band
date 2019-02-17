import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTest {

    Song song;

    @Before
    public void before(){
       song = new Song("Spootiskerry", 3.30);
    }

    @Test
    public void hasSong(){
        assertEquals("Spootiskerry", song.getName());
    }

    @Test
    public void hasDuration(){
        assertEquals(3.30, song.getDuration(), 0.01);
    }
}
