package com.company;


class BookThreaterAPP{
    static int total_seats = 25;
    synchronized static void bookSeats (int seats){
        if(total_seats>=seats){
            System.out.println("Seats booked successfully");
            total_seats= total_seats-seats;
            System.out.println("seats Left:"+total_seats);
        }else{
            System.out.println("Seats cannot be booked");
            System.out.println("Seats left:"+total_seats);
        }
    }
}

class testthread1 extends Thread{
    BookThreaterAPP b;
    int seats;
    testthread1(BookThreaterAPP b ,int seats){
        this.b= b;
        this.seats=seats;
    }


    public void run() {
        b.bookSeats(seats);
    }
}

class testthread2 extends Thread{
    BookThreaterAPP b;
    int seats;
    testthread2(BookThreaterAPP b ,int seats){
        this.b= b;
        this.seats=seats;
    }


    public void run() {
        b.bookSeats(seats);
    }
}

public class staticSynchronization {
    public static void main(String[] args) {

      BookThreaterAPP b1 = new BookThreaterAPP();
        testthread1 t1 = new testthread1(b1,7);
      t1.start();
      testthread2 t2 = new testthread2(b1,8);
      t2.start();

        BookThreaterAPP b2 = new BookThreaterAPP();
        testthread1 t3 = new testthread1(b2,7);
        t3.start();
        testthread2 t4 = new testthread2(b2,8);
        t4.start();


    }
}
