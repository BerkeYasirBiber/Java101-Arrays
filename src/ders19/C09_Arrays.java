package ders19;

import java.util.Arrays;

public class C09_Arrays {
    public static void main(String[] args) {

        int[] arr = {3,8,1,5,2,9};

        enbuyukEnkucukElementyazdir(arr);


    }

    public static void enbuyukEnkucukElementyazdir(int[] arr){

        Arrays.sort(arr); // kucukten buyuge dogru sıralar

        System.out.println("En buyuk element " + arr[arr.length-1] +
                            "\nEn kucuk element " + arr[0]);



    }
}
