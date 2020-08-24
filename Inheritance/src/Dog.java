public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,  int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        this.legs=legs;
    }

    public void chew(){
        System.out.println("dog chewsss chow chow");
    }
    public void run(){
        System.out.println("dog run method called");
        move(9);

    }
    //scope chnages for local precedednce move
    public void move(int speed){
        System.out.println("Move scope changed for dog");
        super.move(speed);
    }
    //overidning Base method
    @Override
    public void eat() {
        chew();
        super.eat();
    }
}
