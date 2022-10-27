package ders15;

import java.util.Scanner;

public class C11_Soru {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ayri ayri isim ve soyisminizi giriniz");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();

        System.out.println(isimsoyisim(isim, soyisim));


    }

    public static String isimsoyisim(String isim,String soyisim){

        String yenisimsoyisim=isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " "+
                                soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();

        return yenisimsoyisim;



    }

}
