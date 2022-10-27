package ders11;

import java.util.Scanner;

public class C05_TernaryOrnek2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tek tek 2 sayi giriniz");
        double sayi1=scan.nextInt();
        double sayi2=scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
    }
}
