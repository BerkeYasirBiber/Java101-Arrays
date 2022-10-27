package ders11;

import java.util.Scanner;

public class C04_TernaryOrnek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu tek tek giriniz");
        double kenar= scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        System.out.println(kenar==kenar2 && kenar2==kenar3 ?
                "Eskenar ucgen" : "Eskenar degil");





    }
}
