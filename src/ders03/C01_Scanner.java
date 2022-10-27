package ders03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String kullaniciIsmi = scan.nextLine();

        System.out.println("Girilen kullanıisi ismi :" + kullaniciIsmi);

        //Bu şekilde run ettiğimiz zaman konsola isim soyisim girebiliyorum.


    }
}
