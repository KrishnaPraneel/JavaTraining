package encapsulation;

public class EncapVehicle {
    private String model;
    private String type;
    private String engine;
    private int seats;
    private String color;
    private String manufacturer;

    public String getModel() {
        return model;
    }


    public String getType() {
        return type;
    }


    public String getEngine() {
        return engine;
    }


    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public EncapVehicle(String model, String type, String engine, int seats, String color, String manufacturer){
        this.model = model;
        this.type = type;
        this.engine = engine;
        this.seats = seats;
        this.color = color;
        this.manufacturer = manufacturer;
    }
}
