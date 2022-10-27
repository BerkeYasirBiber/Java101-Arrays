package ders22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C09_AL_Soru {
    public static void main(String[] args) {

        System.out.println(liseOlustur());


    }

    public static List<String> liseOlustur(){

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String girilenisim="";

        while (!girilenisim.equalsIgnoreCase("q")){

            System.out.println("Lutfen listeye eklemek icin isimler giriniz" +
                    "\nbitirmek icin q'ya basiniz");
            girilenisim=scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }
        }

        return  isimler;

    }
}
