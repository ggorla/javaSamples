package CollectionUdemey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater("Olampina",4,5);
        List<Theater.Seat> seatcopy = new ArrayList<>(theater.seats);

        Collections.reverse(seatcopy);
        System.out.println("Printing copy");
        printList(seatcopy);
        System.out.println("pringing orginal");
        printList(theater.seats);
    }
    public static  void printList(List<Theater.Seat> list){
        for(Theater.Seat seat :list){
            System.out.println(""+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========");
    }
}
