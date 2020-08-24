public class car extends vehicle {
    int stearing;

    public car(int noOfWheels, String vehicleName, int speed, int stearing) {
        super(noOfWheels, vehicleName, speed);
        this.stearing = stearing;
    }

    public void maxSpeed(int speed){
        System.out.println(speed*5);
    }

    @Override
    public void Infobox(String vehicleName) {
        maxSpeed(10);
        super.Infobox(vehicleName);
    }
}
