package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater("Olampian", 8, 12);
        List<Theater.Seat> seatCopy = new ArrayList<>();

       /* theater.getSeats();
       if(theater.reserveSeat("H11")){
           System.out.println("Please pay");
       }else{
           System.out.println("sorry seat is taken;");
       }
        if(theater.reserveSeat("H11")){
            System.out.println("Please pay");
        }else{
            System.out.println("sorry seat is taken;");
        }

        */

        sortList(seatCopy);
        System.out.println("Printing sorted seat copy");
        printList(seatCopy);


    }
    public static  void printList(List<Theater.Seat> list){
        for( Theater.Seat seat : list){
            System.out.println(""+ seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("========");
    }

    public static void sortList(List<? extends  Theater.Seat> list){
        for( int i =0; i<list.size()-1; i++){
            for(int j= i+1;j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
