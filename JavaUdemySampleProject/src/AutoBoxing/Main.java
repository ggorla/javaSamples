package AutoBoxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i = 0; i<10;i++){
            intArray.add(Integer.valueOf(i));
        }
        for(int i =0; i< intArray.size();i++){
            System.out.println(intArray.get(i));
        }
        ArrayList<Double> doubleArray = new ArrayList<Double>();

    }
}
