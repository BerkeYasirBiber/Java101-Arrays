package ders13;

public class C09_SM_Contains {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok")); // true
        System.out.println(str.contains("odla")); // true
        System.out.println(str.contains("java")); // false

        String str2 = "234 Ali Can";

        System.out.println(str2.contains("2")); // true

        /*
        contains içine yazdığımız kelimeler yukardaki cümlenin içinde
        varmı soruyor ve true veya false olarak cevap dönüyor.
         */

    }
}
