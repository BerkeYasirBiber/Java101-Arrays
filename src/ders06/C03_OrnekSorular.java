package ders06;

public class C03_OrnekSorular {
    public static void main(String[] args) {

        int a = 10;
        int b = a++;

        System.out.println(a); // 11
        System.out.println(b); // 10

        /*
        ilk a nın değerini alır 10, bunu b'ye verir. b 10 olur.
        sonra a'nın ++ işlemini yapar a'nın yeni sayısı olan 11 yapar.
        ama b'nin değeri değişmez 10 da kalır.
         */

        int c =10;
        int d = ++c;

        System.out.println(c); // 11
        System.out.println(d); // 11

        /*
        ++ ile başladığı için ilk arttırma işlemini yapar nereye yapar c'ye yapar
        c'nin yeni değeri 11 olur. sonra bu değeri d'ye atar.
        d'ninde değeri 11 olur.
         */
    }
}
