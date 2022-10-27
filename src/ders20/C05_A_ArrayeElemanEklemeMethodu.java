package ders20;

import java.util.Arrays;

public class C05_A_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {

        int[] arr = {3,5,8,9}; // eklenecek sayi = 1

        arrayeelemaneklememethodu(arr);

    }



    public static int[] arrayeelemaneklememethodu(int[] arr){
        int[] arr2= new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {

            arr2[i]=arr[i];


        }

        arr2[arr2.length-1]=1;

        arr=arr2;

        System.out.println(Arrays.toString(arr)); // [3, 5, 8, 9, 1]

        return arr;


    }
}
