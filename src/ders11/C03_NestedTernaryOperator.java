package ders11;

import java.util.Scanner;

public class C03_NestedTernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayi giriniz");
        int tamsayi = scan.nextInt();

        System.out.println(tamsayi>0 ? tamsayi%2==0 ? "Cift sayi" : "Tek sayi"
                        : tamsayi<-100 && tamsayi>-1000 ? "3 basamakli" : "3 basamaki degil"
                );

        /*
        Çok düşünmeye gerek yok bu örnekte çok zor ve sorulmaz.
         */

    }
}
