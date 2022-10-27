package ders08;

import java.util.Scanner;

public class C03_IfStatementsOrnek2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi yaziniz");
        int alinansayi = scan.nextInt();


        if(alinansayi % 3 == 0 ){
            System.out.println("3 ile bolunebilen sayi");
        }
        if(alinansayi % 5 == 0){
            System.out.println("5 ile bolunebilen sayi");
        }
    }
}
