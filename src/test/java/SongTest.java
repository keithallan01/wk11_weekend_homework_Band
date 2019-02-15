import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTest {

    Song song;

    @Before
    public void before(){
       song = new Song("Spootiskerry");
    }

    @Test
    public void hasSong(){
        assertEquals("Spootiskerry", song.getName());
    }
}
