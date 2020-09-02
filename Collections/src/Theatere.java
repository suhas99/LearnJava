import java.util.ArrayList;
import java.util.List;

public class Theatere {
    private final String theatereName;
    private List<Seat> seats = new ArrayList<>();

    //constructor logic to
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

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;

        //checking for the requested seat number in array list
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    //inner class seat
    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
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
