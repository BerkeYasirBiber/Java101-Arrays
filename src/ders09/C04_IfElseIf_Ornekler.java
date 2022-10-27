package ders09;

import java.util.Scanner;

public class C04_IfElseIf_Ornekler {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Kilonuzu yazin");
    int kilo = scan.nextInt();
    double a =kilo*10000;

    System.out.println("Boyunuzu yazin");
    double boy =scan.nextDouble();
    double b =boy*boy;

    System.out.println("vucut kutle endeksi : " + a/b);

    if(a/b>=30){
        System.out.println("Obezsin");
    }
    else if(a/b>=25){
        System.out.println("Kilolu");
    }
    else if(a/b>=20){
        System.out.println("Normal");
    }
    else{
        System.out.println("Zayif");
    }











    }
}
