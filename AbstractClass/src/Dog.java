public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Anmial "+getName()+" is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Animal is breathing");

    }
}
