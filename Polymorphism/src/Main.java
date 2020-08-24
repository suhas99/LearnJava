//polymorphism just to put up in simple words it is way that a method can be implemented in different ways
// usually there are two types compile time polymorphism(overloading) and runtime polymorphism(overriding)
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String movieTagline(){
        return "No default tagline for all movies";
    }
}

class LimitLess extends Movie{
    public LimitLess() {
        super("LimitLess");
    }


    // inheritance is present so it can be implemented
    public String movieTagline(){
        return "You can make more money with big mind";
    }
}

class Lucy extends Movie{
    public Lucy() {
        super("Lucy");
    }
    // can be overridden in this fashion
    @Override
    public String movieTagline() {
        return "you can access 100% of your brain and become incredible";
    }
}

class BahuBali extends Movie{
    public BahuBali() {
        super("BahuBali");
    }
    // no plot method
}
public class Main {
    public static void main(String[] args) {
        // here movie tagline is been used for different implantation's
        for (int countChecker=0; countChecker<10; countChecker++){
            Movie movie =getrandomMovie();
            System.out.println("Movie no "+ countChecker +" "+ movie.getName() +"\n"+
                               "Movie tagline "+movie.movieTagline() +"\n" );
        }
    }


    //static mehod with type movie
    public static Movie getrandomMovie(){
        //typeCaste to int because default random generate returns double b/w 0-1 so multiplied by 3 added to plus  1 to make new method
        int numberGenerated= (int)(Math.random()*3)+1;
        System.out.println("generated random number is "+numberGenerated);

        switch (numberGenerated){
            case 1:
                return new LimitLess();
            case 2:
                return new Lucy();
            case 3:
                return new BahuBali();

//            default:
//                return null;
        }

        return null;

    }



}
