package ders13;

public class C02_SM_Equals {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        String str3 = new String("Ali"); // bu şekildede string oluşturabiliriz.
        String str4="Ali";

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // true

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true

    }
}
