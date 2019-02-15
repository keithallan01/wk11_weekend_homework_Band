public class Musician {

    private String name;
    private InstrumentType instrumentType;

    public Musician(String name, InstrumentType instrumentType) {
        this.name = name;
        this.instrumentType = instrumentType;
    }

    public String getName(){
        return this.name;
    }

    public InstrumentType getInstrument(){
        return this.instrumentType;
    }
}
