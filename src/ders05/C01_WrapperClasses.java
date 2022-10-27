package ders05;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(str.toUpperCase()); // büyük harflerle yazdırır.

        char karekP = 'a';
        System.out.println(Character.isDigit(karekP)); // isdigit - rakammı?
        System.out.println(Character.isLowerCase(karekP)); // islowercase küçük harfmi?

        String sifre1 = "1234";
        String sifre2 = "1000";

        System.out.println(sifre1+"+"+sifre2); // 1234 + 1000
        System.out.println(Integer.valueOf(sifre1) + Integer.valueOf(sifre2));
            // sayıları toplamak istersek Integer.valueOf(...) yazacağız.


    }

}
