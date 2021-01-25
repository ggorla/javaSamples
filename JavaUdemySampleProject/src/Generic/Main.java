package Generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printDoubled(list);

    }
    private static void printDoubled(ArrayList<Integer> n){
        for(int i:n){
            System.out.println(i*2);
        }
    }
}
