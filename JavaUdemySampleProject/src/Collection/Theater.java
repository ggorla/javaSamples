package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();

    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;
        int lastRow = 'A'+(numRows-1);
        for(char row = 'A'; row<= lastRow; row++){
            for(int seatNum=1; seatNum<=seatsPerRow;seatNum++){
                double price =12.00;
                if((row<'D')&&(seatNum>=4 && seatNum<=9)){
                    price=14.00;
                }else if ((row>'F')||(seatNum<4 && seatNum<=9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d"),seatNum);
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }
    public boolean researvSeat_Binary(String seatNumber){
        int low = 0;
        int high = seats.size()-1;
        while(low<=high){
            System.out.println(".");
            int mid = (low+high)/2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);
            if(cmp<0){
                low = mid+1;
            }else if(cmp >0){
                high = mid-1;
            }else
            {
                return seats.get(mid).reserve();
            }

        }
        System.out.println("there is no seat"+ seatNumber);
        return false;
    }
    public boolean reserveSeat(String seatNumber){
        Seat  requestSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats,requestSeat,null);
        if(foundSeat>=0){
            return  seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat"+ seatNumber);
            return false;
        }
       /*
        this is comented to Comparable interface replaced this method
        for(Seat seat: seats){
            System.out.println(".");
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestSeat = seat;
                break;
            }
        }
        if (requestSeat == null) {
            System.out.println("There is no seat"+seatNumber);
            return false;
        }
        return requestSeat.reserve();

        */
    }

    public Collection<Seat> getSeats()
    {
       return seats;
    }
    public class Seat implements  Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }
        public  boolean reserve(){
            if(!this.reserved){
                this.reserved= true;
                System.out.println("seat "+seatNumber+" reserved");
                return  true;
            }else{
                return false;
            }
        }

        public  boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat"+seatNumber+"cancelled");
                return  true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}
