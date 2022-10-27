package ders22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_AL_Soru {
    public static void main(String[] args) {

        List<Double> notlar = listeOlustur();
        System.out.println(notlar);
        raporla(notlar);



    }

    public static void raporla(List<Double> notlar) {

        int ogrencisayisi = notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiogrenciSayisi=0;


        for (int i = 0; i <notlar.size() ; i++) {
            notlarToplami+=notlar.get(i);
        }

        sinifNotOrtalamasi=notlarToplami/ogrencisayisi;


        for (int i = 0; i <notlar.size() ; i++) {

            if (notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiogrenciSayisi++;
            }
        }

        System.out.println("Girilen not sayisi: " + ogrencisayisi +
                "\nGirilen notlarin ortalamasi: " + sinifNotOrtalamasi +
                "\nOrtalama uzerindeki ogrenci sayisi: " + ortalamaUstundekiogrenciSayisi);

    }



    public static List<Double> listeOlustur(){

        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Double girilenNot=1.0;

        while (girilenNot>0){

            System.out.println("Lutfen listeye eklemek icin not giriniz" +
                    "\nbitirmek icin 0'a basiniz");
            girilenNot=scan.nextDouble();

            if (girilenNot>0){
                notlar.add(girilenNot);
            }
        }

        return  notlar;

    }
}
