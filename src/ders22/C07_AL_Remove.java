package ders22;

import java.util.ArrayList;
import java.util.List;

public class C07_AL_Remove {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }


        sayilar.remove(2); // 2.indexteki '4' rakamını kaldırdı.
        System.out.println(sayilar); // [1, 2, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]


        Integer silinecekobje = 4; // silinmesini istediğimiz rakamı obje yaptık.
        sayilar.remove(silinecekobje); // ilk 4 rakamını bulup sildi. sonraki 4'e dokunmadı.
        System.out.println(sayilar); // [1, 2, 3, 5, 3, 5, 2, 5, 1, 2, 5, 3, 4, 5]


        List<Integer> silinecekListe = new ArrayList<>();
        silinecekListe.add(5);
        silinecekListe.add(1);
        sayilar.removeAll(silinecekListe);  // tüm 5 ve 1 leri sildik sayilar listesindeki.
        System.out.println(sayilar); // [2, 3, 3, 2, 2, 3, 4]


        sayilar.clear(); // tüm listeyi temizledi
        System.out.println(sayilar); // []


    }
}
