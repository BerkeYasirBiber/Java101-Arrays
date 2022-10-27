package ders09;

import java.util.Scanner;

public class C05_IfElseIfOrnek3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");

        int tamsayi = scan.nextInt();

        if (tamsayi % 15 == 0) System.out.println("super sayi");
        else if (tamsayi % 5 == 0) System.out.println("5 ile bolunebilen sayi");
        else if (tamsayi % 3 == 0)System.out.println("3 ile bolunebilen sayi");
        else System.out.println("duzgun sayi yaz kamil");

    }
}
