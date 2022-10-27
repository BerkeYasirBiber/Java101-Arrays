package ders13;

public class C10_SM_StartsWith {
    public static void main(String[] args) {

        String str = "manti acarken java ogrenilmez";

        System.out.println(str.startsWith("Manti")); // false
        System.out.println(str.startsWith("m")); // true
        System.out.println(str.startsWith("manti")); // true

        /*
        startsWith = yukarıdaki cümle ne ile başlar m harfi ile başlar
        manti ile başlar veya man ile baslar veya  manti acarken ile başlar
        yani nasıl başladığı önemli
         */
    }
}
