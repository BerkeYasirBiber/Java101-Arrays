package ders20;

import java.util.Arrays;

public class C04_A_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr={2,4,6};

        int[] arr2 = new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {

            arr2[i] = arr[i];


        }

        arr2[arr2.length-1]=8;

        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 8]

        arr=arr2;

        System.out.println(Arrays.toString(arr)); // [2, 4, 6, 8]

    }
}
