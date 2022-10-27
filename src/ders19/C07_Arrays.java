package ders19;

import java.util.Arrays;

public class C07_Arrays {
    public static void main(String[] args) {

        String [] arr = {"Hasan","Adem","Senturk","Omer Faruk"};

        enuzunenkisaisimleriyazdir(arr);

    }

    public static void enuzunenkisaisimleriyazdir(String[] arr){

        String enuzunkelime = arr[0];
        String enkisakelime = arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if (arr[i].length()>enuzunkelime.length()){
                enuzunkelime=arr[i];

            }
        }

        for (int i = 1; i <arr.length ; i++) {

            if (arr[i].length()<enkisakelime.length()){
                enkisakelime=arr[i];
            }
        }

        System.out.println("En uzun isim " + enuzunkelime +
                            "\nEn kisa isim " + enkisakelime);

    }
}
