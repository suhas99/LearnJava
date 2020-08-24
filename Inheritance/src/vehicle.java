public class vehicle {
    //static variables can be used since they call only once for memory.We can
 private static boolean isVechileInCondition;

 private int noOfWheels;
 private String vehicleName;

 public void Infobox(String vehicleName){
     System.out.println("the vehicle "+vehicleName+" is licenced");
 }

    public static boolean isIsVechileInCondition() {
        return isVechileInCondition;
    }

    public static void setIsVechileInCondition(boolean isVechileInCondition) {
        vehicle.isVechileInCondition = isVechileInCondition;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;

    public vehicle(int noOfWheels, String vehicleName, int speed) {
        this.noOfWheels = noOfWheels;
        this.vehicleName = vehicleName;
        this.speed = speed;
    }

}
