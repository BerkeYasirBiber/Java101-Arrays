package ders16;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int alinansayi=0;
        int toplam=0;
        int sayac=0;

        while (toplam<500){

            System.out.println("Lutfen toplanmak uzere sayilari giriniz");
            alinansayi=scan.nextInt();
            sayac++;
            toplam+=alinansayi;

        }

        System.out.println("girilen toplam sayi " + sayac + " toplamlari " + toplam);
        System.out.println("bu kadar yeter");

    }
}
