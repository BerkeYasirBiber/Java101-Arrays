package ders13;

public class C03_SM_EqualsIgnorCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        /*
        equalsIgnoreCase == büyük küçük harf tınlamaz metin aynı olsun
                            yeter der birbirine eşitler.
         */











    }
}
