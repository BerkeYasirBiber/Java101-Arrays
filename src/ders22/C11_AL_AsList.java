package ders22;

import java.util.Arrays;
import java.util.List;

public class C11_AL_AsList {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3};

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println(arraydenList); // [1, 2, 3]

        /*
        çok kullanılmaz negatif yönleri var.
         */
    }
}
