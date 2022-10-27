package ders13;

public class C06_SM_SubString {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.substring(5)); // ogren, isi kap
        System.out.println(str.substring(0)); // Java ogren, isi kap
        System.out.println(str.substring(18)); // p

        /*
        substring  =  parantez içine hangi rakamı veya sayıyı yazıyorsak
        o karakterden sonra kalan yazıyı konsola yazdırıyor.
         */

        System.out.println(str.substring(str.length()-1).toUpperCase()); // P
        /* length ile tüm harfleri aldık 1 çıkartarak substring ile
        son harfini yazdırdık upper case ile büyük yazdırdık.
         */

        System.out.println(str.substring(str.length()-3).toUpperCase()); // KAP








    }
}
