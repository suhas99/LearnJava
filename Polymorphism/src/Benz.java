// to copy a class use refactor and copy class in intellij

class Benz extends Car{
    public Benz(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //Java method uses to get simple name
        return getClass().getSimpleName()+" customEngine";
    }

    @Override
    public String carAccelerate() {
        return getClass().getSimpleName()+" customAccelerate";
    }

    @Override
    public String carBrake() {
        return getClass().getSimpleName()+" customBrake";
    }
}



