package ders04;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int birincitamsayi = scan.nextInt();
        System.out.println("Ikinci tamsayi giriniz");
        int ikincitamsayi = scan.nextInt();
        System.out.println("Birbirlerine bolumu : " + birincitamsayi/ikincitamsayi);

        double doublesonuc = (double)birincitamsayi/ikincitamsayi;
        System.out.println("dogru sonuc icin ilk sayiyi double'a cast yapiyoruz : " + doublesonuc);

    }
}
