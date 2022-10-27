package ders19;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        int[] arr = {3,-3,5,-7,-6,1,-2};

        System.out.println(pozitifelementleritopla(arr)); // 9


    }

    public static int pozitifelementleritopla(int[] arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0){
                toplam+=arr[i];

            }
        }

        return toplam;

    }
}
