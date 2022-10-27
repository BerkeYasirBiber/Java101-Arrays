package ders04;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int a = 256;
        /*
        byte değeri +128 sağ taraf -128 sol taraf toplam =
        0 konsolda 256 0 sonucunu verdi
         */

        byte b = (byte)a;
        System.out.println(b);
    }

}
