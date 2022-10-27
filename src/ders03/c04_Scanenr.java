package ders03;

import java.util.Scanner;

public class c04_Scanenr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isim ve soyisminizi giriniz");

        String isimsoyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();

        System.out.println("Girilen Bilgiler ; " + isimsoyisim + " , " + yas);

        // BU ÖRNEK GÜZEL OLDU.
    }
}
