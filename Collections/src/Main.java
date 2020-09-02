public class Main {
    public static void main(String[] args) {
        Theatere theatere = new Theatere("Inox",5,3);
        //to get all seats
        theatere.getSeats();
        //tobook seat
        if(theatere.reserveSeat("A02")){
            System.out.println("pay the price");
        }else{
            System.out.println("not available");
        }
        //to check seat is taken
        if(theatere.reserveSeat("A02")){
            System.out.println("pay the price");
        }else{
            System.out.println("not available");
        }
    }
}
