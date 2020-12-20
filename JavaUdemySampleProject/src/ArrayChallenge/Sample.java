package ArrayChallenge;

import java.util.Scanner;

public class Sample {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = getInteger(5);
        int[] sortedArray = sortedInteger(array);
        printArray(sortedArray);
    }
    public  static int[] getInteger(int number){
        int[] myArray =  new int[number];
        for(int i=0;i<myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static int[] sortedInteger(int[] array){
        int[] sortedarray = new int[array.length];
        for(int i =0; i<array.length;i++){
            sortedarray[i] = array[i];
        }
        boolean flag = true;
        while(flag){
            flag = false;
            int temp =0;
            for(int i = 0; i<sortedarray.length-1; i++){
                if(sortedarray[i]<sortedarray[i+1]){
                    temp = sortedarray[i];
                    sortedarray[i] = sortedarray[i+1];
                    sortedarray[i+1]= temp;
                    flag=true;
                }
            }
        }
        return  sortedarray;
    }
    public  static  void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}

