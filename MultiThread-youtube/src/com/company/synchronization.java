package com.company;


class  bookThreaterSeat{
    int total_seats=10;
    synchronized void bookSeat(int seats){
        if(total_seats>=seats){
            System.out.println(seats+"Seats bookes successfully");
            total_seats= total_seats-seats;
            System.out.println("Seats Left:"+total_seats);

        }
        else{
            System.out.println(" sorry Seats Left"+total_seats);
        }
    }
}
public class synchronization extends Thread {
    static  bookThreaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new bookThreaterSeat();
        synchronization t = new synchronization();
        t.seats = 7;
        t.start();

        synchronization t1 = new synchronization();
        t1.seats = 6;
        t1.start();
    }
}
