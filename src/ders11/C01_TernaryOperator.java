package ders11;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi%5==0 ? "Sayi 5'in tam kati" : "5'in tam kati degil");
        /*
            ternary operators demek if else ne demekse o demek, daha kolay örnekleri
         daha basit yazmak için kullanılır. if else gibi uğraştırmaz.
         */







    }
}
