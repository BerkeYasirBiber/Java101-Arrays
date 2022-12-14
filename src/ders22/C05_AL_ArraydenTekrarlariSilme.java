package ders22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_AL_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }
        }

        System.out.println(tekrarsizListe); // [1, 2, 4, 3, 5]

        arr = new int[tekrarsizListe.size()];

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=tekrarsizListe.get(i);

        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 4, 3, 5]


    }
}
