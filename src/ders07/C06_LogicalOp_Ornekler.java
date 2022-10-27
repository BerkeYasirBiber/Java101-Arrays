package ders07;

public class C06_LogicalOp_Ornekler {
    public static void main(String[] args) {

        int a=10;
        int b=15;

        System.out.println(a>b || b>0); // true
        System.out.println(a<=b-5 || a>b-8); //true

        boolean c;
        System.out.println(c=15>=b || a<0);  // true

        c=a>=b || 3*a<4*b;
        System.out.println(c); // true

        /*
        || operatörü birleştirdiği 2 boolean ifadenin ikiside false ise sonucu
        false yapar. bunun dışındaki tüm durumlarda sonucu true yapar.
        || operatörüne ingilizcede or(veya) diyorlar.
         */
    }
}
