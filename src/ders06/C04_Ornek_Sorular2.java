package ders06;

public class C04_Ornek_Sorular2 {
    public static void main(String[] args) {

        int a =10;
        System.out.println(++a); // 11

        int b=a++;
        System.out.println(b); // 11   // a=12 b=11

        int c= b++ + a;
        System.out.println(c); // 23
        System.out.println((a+b+c)); // a=12 b=12 c=23 toplamı:47

        /*
        bunlar -- lerdede geçerli bu sefer çıkartma işlemlerini yapıyoruz.
        bu örnekler güzel öğretici.
         */

    }
}
