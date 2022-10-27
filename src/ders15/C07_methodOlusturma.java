package ders15;

import java.util.Scanner;

public class C07_methodOlusturma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println(carpimmethodu(sayi1,sayi2));


    }

    public static int carpimmethodu(int sayi1,int sayi2) {
        System.out.println("carpim methodu calisti");
        return sayi1*sayi2;



    }




}
