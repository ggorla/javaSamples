package com.basicstrong.arrays;

public class DeclarationTYPES
{
    public static void main(String[] args) {

        int[] x;
        //cannot do this
        //x = {1,2,3};
        int[] y = {1,2,3,4,5};
        int[] z = new int[3];

        //2 d array
        int[][] a;
        int [][] b = new int[2][];
        b[0] = new int[2];
        b[1] = new int[3];
        System.out.println(b[0][0]);
        b[0][0] = 55;
        int[][] c = {{1,2,3},{6,7}};
        for(int[] array:c){
            for(int ele: array){
                System.out.println(ele);
            }
        }
    }
}
