public class Musician {

    private String name;
    private InstrumentType type;

    public Musician(String name, InstrumentType type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }
}
