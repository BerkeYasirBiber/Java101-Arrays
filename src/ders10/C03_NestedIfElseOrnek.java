package ders10;

import java.util.Scanner;

public class C03_NestedIfElseOrnek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kac adet urun aldiniz");
        int adet = scan.nextInt();

        System.out.println("Liste fiyati nedir");
        double fiyat = scan.nextDouble();

        System.out.println("Musteri kartiniz varmi");
        boolean kartvarmi=scan.nextBoolean();



        if (kartvarmi && adet >= 10  && fiyat < 999 && fiyat>0) {
                System.out.println("%20 indirim kazandiniz " + "Indiriminiz " +
                    (adet * fiyat) * 0.2);}
        else if (kartvarmi && adet < 10 && adet>0 && fiyat < 999 && fiyat>0) {
                System.out.println("%15 indirim kazandiniz " + "Indirimiz " +
                    (adet * fiyat) * 0.15);}

        else if (!kartvarmi && adet >= 10 && fiyat < 999 && fiyat>0) {
                System.out.println("%15 indirim kazandiniz " + "Indirimiz " +
                    (adet * fiyat) * 0.15);}

        else if (!kartvarmi && adet < 10 && adet>0 && fiyat < 999 && fiyat>0) {
                System.out.println("%10 indirim kazandiniz " + "Indirimiz " +
                        (adet * fiyat) * 0.1);
        } else System.out.println("Fiyat,adet,kart bilgisinde hata var");


        /*
        !kartvarmi == false demek
         kartvarmi == true demek
         */

        }
    }