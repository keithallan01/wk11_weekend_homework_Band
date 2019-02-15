import java.util.ArrayList;

public class Band {
    private String name;
    private String genre;
    private ArrayList<Musician> musicians;

    public Band(String name, String genre){
        this.name = name;
        this.genre = genre;
        this.musicians = new ArrayList<>();
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
}
