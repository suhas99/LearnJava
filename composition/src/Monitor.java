public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    //composition
    private Resolution nativeResultion;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResultion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResultion = nativeResultion;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResultion() {
        return nativeResultion;
    }

    public void drawPixelAt(int x, int y, String colour){
        System.out.println("drawing pixel at "+x+","+"y in colour"+colour);

    }
}
