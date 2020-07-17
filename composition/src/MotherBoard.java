public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bias;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bias) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bias = bias;
    }

    public void loadProgram(String programName){
        System.out.println("the program is "+programName+" is loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBias() {
        return bias;
    }
}
