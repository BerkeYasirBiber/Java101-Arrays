package ders10;

import java.util.Scanner;

public class C01_NesteIfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi yaziniz");
        String cinsiyet = scan.nextLine();


        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();


        if(yas<0){
            System.out.println("Girilen yas gecersiz");
        } else if(!(cinsiyet.equalsIgnoreCase("Kadin") ||
                cinsiyet.equalsIgnoreCase("Erkek"))){
            System.out.println("Girilen cinsiyet gecersiz.");
        } else if(cinsiyet.equalsIgnoreCase("Erkek") && yas>=65){
            System.out.println("Emekli olabilirsin");
        }else if(cinsiyet.equalsIgnoreCase("Erkek") && yas<65){
            System.out.println("Emekli olamazsin " + (65-yas) + " yil daha calisman gerekir");
        } else if(cinsiyet.equalsIgnoreCase("Kadin") && yas>=60){
            System.out.println("Emekli olabilirsin");
        }else if(cinsiyet.equalsIgnoreCase("Kadin") && yas<60){
            System.out.println("Emekli olamazsin " +(60-yas)+ " yil daha calisman gerekir.");
        }
        else{
            System.out.println("Gecersiz parametre");
        }


    }
}
