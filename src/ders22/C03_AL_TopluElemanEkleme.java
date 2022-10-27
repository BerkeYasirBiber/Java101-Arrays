package ders22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_AL_TopluElemanEkleme {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        String [] arr = {"a","e","i","o","u"};


        for (int i = 0; i <arr.length ; i++) {

            harfler.add(arr[i]);

        }

        System.out.println(harfler); // [a, e, i, o, u]

        System.out.println(harfler.size()); // 5  // list'in boyutu 5

        System.out.println(harfler.isEmpty()); // false (harfler listinin içi boşmu sorusunu sorar)

        System.out.println(harfler.get(4)); // u // 4. indexteki harfi getirdi.

        Collections.sort(harfler); // alfabe sıralamasına göre sıralar.
        System.out.println(harfler); // [a, e, i, o, u]

        System.out.println(harfler.subList(1,3)); // [e, i] // 1 ile 3 index arasını verir 3.indexi vermez.



    }
}
