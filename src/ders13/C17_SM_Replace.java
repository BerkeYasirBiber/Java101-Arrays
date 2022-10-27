package ders13;

public class C17_SM_Replace {
    public static void main(String[] args) {

        String str ="Java candir";

        System.out.println(str.replace('a','A'));

        /*
        küçük a'ları büyük A yaptı. Bütün a ları büyük A yaptı.
         */

        System.out.println(str.replace("candir","adamdir"));

        /*
        candir kelimesi yerine adamdir yazdik.
         */

        System.out.println(str.replaceFirst("a","A"));
        // ilk a'yı büyük A yazdık.


       String str1="J1ava2 G9uzel5dir8";

        System.out.println(str1.replaceAll("\\d",""));
        // Java Guzeldir

        /*
           \\s : space     \\S : space olmayan hersey
           \\s+ : yanyana birden fazla space(birden fazla space varsa tek space'e düşürebiliriz.)
           \\d : digits     \\D : digit olmayan hersey
           \\w : harf veya rakam    \\W : harf veya rakam olmayan hersey
         */

        System.out.println(str1.replaceAll("\\D","")); //12958


    }
}
