package ders03;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dairenin yaricapini giriniz");

        double yaricap = scan.nextDouble();

        double daireAlani = 3.14 * yaricap * yaricap;

        System.out.println("Dairenin alani :" + daireAlani);
    }
}
