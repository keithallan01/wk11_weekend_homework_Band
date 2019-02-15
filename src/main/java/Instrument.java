public class Instrument {
    private InstrumentType type;
    private String manufacturer;
    private String model;

    public Instrument(InstrumentType type, String manufacturer, String model) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public InstrumentType getType(){
        return this.type;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModel(){
        return this.model;
    }
}
