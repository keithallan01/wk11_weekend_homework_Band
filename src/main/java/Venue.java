import java.util.ArrayList;

public class Venue {
    private String name;
    private int capacity;
    private ArrayList<Person> audience;
    private ArrayList<Band> bands;

    public Venue(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.audience = new ArrayList<>();
        this.bands = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int audienceCount(){
        return this.audience.size();
    }

    public void addPerson(Person person){
        if (audienceCount() < this.capacity)
        audience.add(person);
    }

    public int bandCount(){
        return this.bands.size();
    }

    public void addBand(Band band){
        bands.add(band);
    }

    public Person removePerson(){
        return this.audience.remove(0);
    }
}
