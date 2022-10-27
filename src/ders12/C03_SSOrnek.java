package ders12;

import java.util.Scanner;

public class C03_SSOrnek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ay numarasi giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo){
            case 1 -> System.out.println("Ocak");
            case 2 -> System.out.println("Subat");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Nisan");
            case 5 -> System.out.println("Mayıs");
            case 6 -> System.out.println("Haziran");
            case 7 -> System.out.println("Temmuz");
            case 8 -> System.out.println("Agustos");
            case 9 -> System.out.println("Eylül");
            case 10 -> System.out.println("Ekim");
            case 11 -> System.out.println("Kasım");
            case 12 -> System.out.println("Aralık");
            default -> System.out.println("Gecersiz Giris");
        }

        switch (ayNo) {
            case 12, 1, 2 -> System.out.println("Kıs");
            case 3, 4, 5 -> System.out.println("Ilkbahar");
            case 6, 7, 8 -> System.out.println("Yaz");
            case 9, 10, 11 -> System.out.println("Sonbahar");
            default -> System.out.println("Gecersiz Giris");
        }

    }
}
