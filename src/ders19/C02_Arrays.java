package ders19;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr = {"Ali", "Ulus", "Nesrin"};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");  // Ali Ulus Nesrin
        }

        System.out.println("");

        System.out.println(Arrays.toString(arr)); // [Ali, Ulus, Nesrin]




    }
}
