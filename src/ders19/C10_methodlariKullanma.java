package ders19;

import ders15.C07_methodOlusturma;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class C10_methodlariKullanma {
    public static void main(String[] args) {

        int[] arr={2,3,4};

        C03_Arayys.elementleri2artir(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]


        System.out.println(C04_Arrays.pozitifelementleritopla(arr)); // 15


        C05_Arrays.arraydeelemanarama(arr,10); // 0


        int[] yeniArr=C06_Arrays.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));


    }
}
