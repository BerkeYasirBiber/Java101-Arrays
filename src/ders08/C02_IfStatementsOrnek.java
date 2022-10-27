package ders08;

import java.util.Scanner;

public class C02_IfStatementsOrnek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");
        char girilenharf = scan.next().charAt(0);

        if(girilenharf == 'o' || girilenharf == 'O'){
            System.out.println("Ocak");
        }

        if(girilenharf == 's' || girilenharf == 'S'){
            System.out.println("Subat");
        }

        if(girilenharf == 'm' || girilenharf == 'M'){
            System.out.println("Mart,Mayis");
        }














    }
}
