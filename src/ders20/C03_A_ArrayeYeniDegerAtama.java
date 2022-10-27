package ders20;

import java.util.Arrays;

public class C03_A_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        String [] arr1={"Ali","Veli"};
        String [] arr2={"A","B","C"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1)); // [A, B, C]


        arr1=new String[6];

        System.out.println(Arrays.toString(arr1)); // [null, null, null, null, null, null]




    }
}
