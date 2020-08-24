public class Main {
    public static void main(String[] args){
    Animal animal =new Animal("AnimalGeneric",1,1,10,20);
    Dog dog= new Dog("doggie",20,30,2,4,1,32,"golden silky");
    dog.eat();
    dog.run();

    }
}

//the diff b/w reference &object
//The object is space where value is stored
//The reference is the address pointer
//eg House obj= new House;
//    House reference=obj;
