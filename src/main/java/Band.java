import java.util.ArrayList;
import java.util.HashMap;

public class Band {
    private String name;
    private String genre;
    private ArrayList<Musician> musicians;
    private HashMap<String, ArrayList<Song>> playlist;
    private ArrayList<Song> songs;

    public Band(String name, String genre){
        this.name = name;
        this.genre = genre;
        this.musicians = new ArrayList<>();
        this.playlist = new HashMap<>();
        this.songs = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public String getGenre(){
        return this.genre;
    }

    public int memberCount(){
        return this.musicians.size();
    }

    public void addMember(Musician musician){
        this.musicians.add(musician);
    }

    public int songCount(){
       return this.songs.size();
    }

    public void addSong(Song song){
        this.songs.add(song);
    }

//    public HashMap<String, ArrayList<Song>> playSongByTitle(Song song){
//        return this.playlist.get(song);
//    }
}
