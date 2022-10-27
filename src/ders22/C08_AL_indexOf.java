package ders22;

import java.util.ArrayList;
import java.util.List;

public class C08_AL_indexOf {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar.indexOf(2)); // 1 // 2'nin ilk kullanıldığı index olan 1.indexi verdi.

        System.out.println(sayilar.lastIndexOf(2)); // 10 // 2'nin son kullanıldığı index olan 10.indexi  verdi.



    }
}
