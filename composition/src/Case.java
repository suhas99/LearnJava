import java.awt.*;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    //composition
    private Dimensions dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }
    public void pressPowerButton(){
        System.out.println("power button pressed");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
