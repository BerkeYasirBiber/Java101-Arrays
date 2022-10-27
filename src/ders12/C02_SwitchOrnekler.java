package ders12;

import java.util.Scanner;

public class C02_SwitchOrnekler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'j' -> System.out.println("Java");
            case 'd' -> System.out.println("Development");
            case 'k' -> System.out.println("Kit");
            default -> System.out.println("Gecersiz harf");
        }
    }
}
