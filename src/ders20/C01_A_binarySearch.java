package ders20;

import java.util.Arrays;

public class C01_A_binarySearch {
    public static void main(String[] args) {

        int[] arr = {1,8,9,3,7,2,5,8,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 7, 8, 8, 9]
        System.out.println(Arrays.binarySearch(arr,8)); // 6
        System.out.println(Arrays.binarySearch(arr,5)); // 4
        System.out.println(Arrays.binarySearch(arr,1)); // 1
        System.out.println(Arrays.binarySearch(arr,9)); // 8



    }
}
