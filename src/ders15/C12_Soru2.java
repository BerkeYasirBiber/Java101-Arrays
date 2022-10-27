package ders15;

import java.util.Scanner;

public class C12_Soru2 {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        System.out.println("tamsayi giriniz");
        int tamsayi=scan.nextInt();


        System.out.println(asalsayimi(tamsayi));

    }

    public static String asalsayimi(int tamsayi){

        String sonuc="asal";

        for (int i = 2; i <=tamsayi-1 ; i++) {

            if (tamsayi%i==0){

                sonuc="asal sayi degil";

                break;

            }
        }

    return sonuc;

    }

}
