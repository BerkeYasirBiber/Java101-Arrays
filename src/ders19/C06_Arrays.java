package ders19;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    public static void main(String[] args) {

       int[] kullaniciArrayi = arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));

    }



    public static int[] arrayOlustur(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arrayin boyutunu giriniz");

        int boyut = scan.nextInt();

        int[] kullaniciArrayi = new int[boyut];


        for (int i = 0; i <boyut ; i++) {
            System.out.println("array'e eklenecek bir sayi giriniz");
            kullaniciArrayi[i]=scan.nextInt();

        }

        return kullaniciArrayi;


    }
}
