package ders12;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun giriniz 1 or 7");
        int gun=scan.nextInt();

        switch (gun) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Sali");
            case 3 -> System.out.println("Carsamba");
            case 4 -> System.out.println("Persembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            case 8 -> System.out.println("Vay be");
            default -> System.out.println("Gecersiz");
        }







    }
}
