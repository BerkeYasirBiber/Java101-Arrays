package ders07;

public class C05_Logical_Operators {
    public static void main(String[] args) {

        int a=10;
        int b=15;

        System.out.println(a>b && b>0); // false
        System.out.println(a<=b-5 && a>b-8); // true

        boolean c;
        System.out.println(c=15>=b && a<0); // false

        c=a>=b && 3*a<4*b;
        System.out.println(c); //false

        /*
        && operatörü birlestirdiği 2 boolean ifadenin ikisi de true ise sonucu true
        yapar,bunun disindaki tüm durumlarda sonucu false yapar.

        && operatörü ilk false gördüğü zaman sonucu direk false yazdırır. - Hızlıdır
        &  operaörü ise tüm işlemleri yapar sonra false döndürür. - Yavaştır.

        && veya & bu operatörlerin ikisinede ingilizcede and(ve) diyorlar.
         */


    }
}
