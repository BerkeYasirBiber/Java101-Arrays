package ders22;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class C02_AL_ElementEkleme {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);

        sayilar.add(1,15); // 1. indexe 15 ekle.

        sayilar.add(0,44); // listenin 0.indexine(basina) 44 ekle.

        System.out.println(sayilar); // [44, 10, 15, 20]


        List<Integer> eklenecekListe = new ArrayList<>();

        eklenecekListe.add(3);
        eklenecekListe.add(5);

        sayilar.addAll(eklenecekListe);

        System.out.println(sayilar); // [44, 10, 15, 20, 3, 5]

        sayilar.addAll(1,eklenecekListe); // 1. indexe ekleneceklisteyi ekle

        System.out.println(sayilar); // [44, 3, 5, 10, 15, 20, 3, 5]

    }
}
