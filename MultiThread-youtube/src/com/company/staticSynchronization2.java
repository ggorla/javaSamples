package com.company;

class  BookingTicket{
    static int ticket_seats = 20;
    synchronized static void ticketsLeft(int seats){
        if(ticket_seats>=0){
            System.out.println(seats+"Ticket booked");
            ticket_seats = ticket_seats-seats;
            System.out.println(ticket_seats+"tickets left");
        }else
        {
            System.out.println("ticket left"+ticket_seats+"boocking was not compleate");
        }
    }
}
class MyexThread1 extends Thread{
    BookingTicket b = new BookingTicket();
    int seats;
    MyexThread1(BookingTicket b, int seats){
        this.b = b;
        this.seats = seats;
    }


    public void run() {
        b.ticketsLeft(seats);
    }
}

class MyexThread2 extends Thread{
    BookingTicket b = new BookingTicket();
    int seats;
    MyexThread2(BookingTicket b, int seats){
        this.b = b;
        this.seats = seats;
    }


    public void run() {
        b.ticketsLeft(seats);
    }
}
public class staticSynchronization2 {
    public static void main(String[] args) {
        BookingTicket b1 = new BookingTicket();
        MyexThread1 t1 = new MyexThread1(b1,7);
        t1.start();
    }
}
