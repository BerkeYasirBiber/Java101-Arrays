package ders09;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ucgenin 3 kenar uzunlugunu " +
                "ayri ayri entere basarak girin");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if(kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar Ucgen");
        } else {
            System.out.println("Eskenar Ucgen Degil");
        }













    }
}
