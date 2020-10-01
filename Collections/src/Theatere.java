import java.util.*;

public class Theatere {
    private final String theatereName;
    // collection interface has a hierarchy of sets(sorted set),queues,deque,and lists,maps(sorted map),treeset
 // we can use arraylist,linked list or hash set or linkedhashset
//    private List<Seat> seats = new LinkedList<>();
//    private Collection<Seat> seats = new HashSet<>();
//    private Collection<Seat> seats = new ArrayList<>();
    private List<Seat> seats = new ArrayList<>();

    //constructor logic to assign seats in row alphabetwise
    public Theatere(String theatereName, int numRows, int seatsPerRow) {
        this.theatereName = theatereName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatereName() {
        return theatereName;
    }

    //common method to check the reserve seat.
//    public boolean reserveSeat(String seatNumber) {
//        Seat requestedSeat = null;

    //checking for the requested seat number in array list in using binary search. when using binary search use list and comment other method

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat= Collections.binarySearch(seats,requestedSeat,null);

        if(foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }
        else{
            System.out.println("There is no seat "+seatNumber);
            return false;
        }


        //checking for the requested seat number in array list in normal logic
//        for(Seat seat : seats) {
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    //inner class seat
    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved=false;
                System.out.println(" Reservation of seat "+seatNumber+" cancelled");
                return true;
            }else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
