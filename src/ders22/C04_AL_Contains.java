package ders22;

import java.util.ArrayList;
import java.util.List;

public class C04_AL_Contains {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        int[] arr = {2,5,7,9,1,0,4,5,6,3,5,4,6};

        for (int i = 0; i <arr.length; i++) {

            sayilar.add(arr[i]);
        }

        System.out.println(sayilar.contains(3)); // true
    }
}
