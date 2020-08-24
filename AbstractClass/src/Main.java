//Based on relationships "is a" ,"has a" and "can a"
//using Abstract clasees we can use fields of abstract classes and constructors, but its ststic final in interface
public class Main {
    public static void main(String[] args) {
        Dog dog =new Dog("german shepard");
        dog.eat();
        dog.breathe();

        Bird bird =new Bird("Dove");
        bird.eat();
        bird.breathe();


    }

}
