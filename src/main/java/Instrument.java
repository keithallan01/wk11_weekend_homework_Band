public class Instrument {
    private String type;
    private String manufacturer;
    private String model;

    public Instrument(String type, String manufacturer, String model) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getType(){
        return this.type;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }
}
