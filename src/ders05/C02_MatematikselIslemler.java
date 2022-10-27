package ders05;

import java.util.Scanner;

public class C02_MatematikselIslemler {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz"); // rakamlarını toplatıcaz.
        int sayi =scan.nextInt(); // sayıya 123 vericez

        int birlerbasamagi=0;
        int rakamlarintoplami=0;

        birlerbasamagi=sayi%10;  // 3      // % = bölme işlemi sonucu kalanı verir.
        rakamlarintoplami=rakamlarintoplami+birlerbasamagi; //3
        sayi=sayi/10; // 12

        birlerbasamagi=sayi%10; // 2
        rakamlarintoplami = rakamlarintoplami+birlerbasamagi; // 5
        sayi=sayi/10; // 1

        birlerbasamagi=sayi%10; // 1
        rakamlarintoplami=rakamlarintoplami+birlerbasamagi; // 6
        sayi=sayi/10; // 0

        System.out.println("Rakamlarin toplami : "+rakamlarintoplami); // cevap 6 olması lazım.

    }
}
