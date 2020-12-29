package LinkedListUdemy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for Customer"+ customer.getName()+ "is "+customer.getBalance());

        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(3);
        intlist.add(4);
        for(int i =0; i<intlist.size();i++){
            System.out.println(intlist.get(i));
        }
        intlist.add(1,2);
        for(int i =0; i<intlist.size();i++){
            System.out.println(intlist.get(i));
        }

    }
}
