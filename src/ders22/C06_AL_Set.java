package ders22;

import java.util.ArrayList;
import java.util.List;

public class C06_AL_Set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        sayilar.set(0,8); // 0. indexteki rakamı 8 yaptı. // update etti değiştirdi.
        sayilar.set(1,9); // 1. indexteki rakamı 9 yaptı. // update etti değiştirdi.
        System.out.println(sayilar); // [8, 9, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]








    }
}
