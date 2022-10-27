package ders06;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        int sayi = 10;
        sayi++; // 11

        int c = sayi++;
        System.out.println(c); // 11
        System.out.println(sayi); // 12

        int d = ++sayi;
        System.out.println(d); // 13
        System.out.println(sayi); // 13

    }
}
