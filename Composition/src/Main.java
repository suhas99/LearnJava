import java.awt.*;
// using compositions we can use many classes at same time without inheriting
//Always use composition over inheritance .one of the best practices
//Composition defines has a relationship status

public class Main {
    public static void main(String[] args) {
   //objects of composite can be declared in 2 ways
   //1st way
    Dimensions dimensions =new Dimensions(30,20,10);
    Case theCase = new Case("model1","intel","220v",dimensions);
    //2nd way
    Monitor theMonitor =new Monitor("led125","compaq",15,new Resolution(10,15));
    MotherBoard theMotherboard =new MotherBoard("x32196","intel",5,2,"0");
    PC newPc=new PC(theCase,theMonitor,theMotherboard);
    //acceseing methods of composition
    newPc.getTheCase().pressPowerButton();
    // newPc.getMonitor().drawPixelAt(10,20,"gren");
    newPc.powerUp(10,20,"green");

    }
}
