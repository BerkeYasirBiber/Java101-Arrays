package ders15;

import java.util.Scanner;

public class C05_MedhodOlusturma {
    public static void main(String[] args) {
        istetoplayazdir();

    }

    public static void istetoplayazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int toplamsayi=sayi1+sayi2;
        System.out.println(toplamsayi);




    }
}
