class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels =4;
    }

    public String startEngine(){
        return "car --- Engine started";
    }

    public  String carAccelerate(){
        return "car --- Accelerating";
    }
    public String carBrake(){
        return "car --- Applied brakes";

    }
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

// to copy a class use refactor and copy class in intellij

class Lamborigini extends Car{
    public Lamborigini(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //overriding like trhis helps to call logic of base method after customCode in called
        System.out.println("customEngine");
        return super.startEngine();
    }

    @Override
    public String carAccelerate() {
        System.out.println("customAccelerate");
        return super.carAccelerate();
    }

    @Override
    public String carBrake() {
        System.out.println("customBrake");
        return super.carBrake();
    }
}


public class polymorphismCar {
    public static void main(String[] args) {
        Car firstCar =new Car(4,"Astin martin");
        System.out.println(firstCar.startEngine());
        System.out.println(firstCar.carAccelerate());
        System.out.println(firstCar.carBrake());

        Lamborigini secondCar =new Lamborigini(8,"Lamborghini Aventadeor");
        System.out.println(secondCar.startEngine());
        System.out.println(secondCar.carAccelerate());
        System.out.println(secondCar.carBrake());

        // A way of creating inline classes
        // to do this easy way is refactor of existing class and make inline
        Car thirdCar = new Car(6, "RedFord") {
            @Override
            public String startEngine() {
                return "Ford engine started";
            }

            @Override
            public String carAccelerate() {
                return "Ford accelerating";
            }

            @Override
            public String carBrake() {
                return "Ford brake";
            }
        };
        System.out.println(thirdCar.startEngine());
        System.out.println(thirdCar.carAccelerate());
        System.out.println(thirdCar.carBrake());

        Bmw fourthCar= new Bmw(7,"class c");
        System.out.println(fourthCar.startEngine());
        System.out.println(fourthCar.carAccelerate());
        System.out.println(fourthCar.carBrake());

        Benz fifthCar= new Benz(6,"A8");
        System.out.println(fifthCar.startEngine());
        System.out.println(fifthCar.carAccelerate());
        System.out.println(fifthCar.carBrake());

    }

    // moved class using refactor to make inner class of base method
    static class Bmw extends Car{
        public Bmw(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Bmw customEngine";
        }

        @Override
        public String carAccelerate() {
            return "Bmw customAccelerate";
        }

        @Override
        public String carBrake() {
            return "Bmw customBrake";
        }
    }
}
