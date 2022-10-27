package ders13;

public class C13_SM_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9

        /*
         konsolda 9 yazdırdı. Oda ilk a'nın bulunduğu index'i verdi.
         */

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("hersey")); // 15
    }
}
