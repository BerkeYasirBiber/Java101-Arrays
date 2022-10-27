package ders04;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {

        int a = 'a' + 'b';  // 97 + 98 = 195 değerini verdi. tek harflerin sayı değerleri var.
        int b ='b';
        System.out.println(a);
        System.out.println('a'+'b');
        System.out.println(""+'a'+'b'+'c'+'d');
        System.out.println("'a'+'b'");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenkarakter = scan.next().charAt(0);
        System.out.println("Girilen karakter : " + girilenkarakter);
        System.out.println("Girilen karakter : " + (int)girilenkarakter);
        System.out.println("girilen karakter : " + (girilenkarakter + a + b));
        System.out.println("girilen karakterin bir sonrasi sayi ile: " + (girilenkarakter+1)); // sayı ile verdi.
        System.out.println("girilen karakterin bir sonrasi : " + (char)(girilenkarakter+1));
        System.out.println("girilen karakterin iki sonrasi : " + (char)(girilenkarakter+2));
        System.out.println("girilen karakterin uc sonrasi : " + (char)(girilenkarakter+3));

    }
}
