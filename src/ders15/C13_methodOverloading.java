package ders15;

public class C13_methodOverloading {
    public static void main(String[] args) {

        carpim(5,9);

    }

    public static void carpim(int sayi1,int sayi2){
        System.out.println(sayi1 * sayi2);


    }

    public static void carpim(int sayi3,int sayi4,int sayi5) {
        System.out.println(sayi3 * sayi4 * sayi5);


    }


    public static void carpim(double sayi6,int sayi7) {
        System.out.println(sayi6 * sayi7);

    }








}
