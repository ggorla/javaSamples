package CollectionUdemey;

import java.util.*;

public class Theater {
    private final String theaterName;
    public final List<Seat> seats= new ArrayList<>();
    public Theater(String theaerName, int numRows, int seatsPerRow) {
        this.theaterName = theaerName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row < lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheaterName(){
        return theaterName;
    }

    public void getSeats() {
       for(Seat seat: seats){
           System.out.println(seat.getSeatNumber());
       }
    }

    public boolean reservSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSet = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSet<0){
            return seats.get(foundSet).reserve();
        }else{
            System.out.println("There is no seat"+seatNumber);
            return false;
        }

        /*
        // Traditional way with out binary search

        Seat requestedSeat = null;
        for (Seat seat : seats) {
            System.out.println(".");
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("Thre is no Seat"+seatNumber);
            return false;
        }

        */

    }

    public boolean reservSeatBinary(String seatnumber)
    {
        int low = 0;
        int high = seats.size()-1;
        while(low<high){
            int mid = (low+high)/2;
            Seat midvalue = seats.get(mid);
            int cmp = midvalue.getSeatNumber().compareTo(seatnumber);
            if(cmp<0)
                low = mid+1;
            else if(cmp>0){
                high = mid-1;
            }
            else
                return seats.get(mid).reserve();
        }
        System.out.println("There is no Seat"+seatnumber);
        return false;

    }
    public class Seat implements  Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved=false;
        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat o) {
            return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat"+seatNumber+" is reservred");
                return true;
            }else{
                return false;
            }
        }
        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Seat"+ seatNumber+ " this is cancelled");
                return  false;
            }else
                return true;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
