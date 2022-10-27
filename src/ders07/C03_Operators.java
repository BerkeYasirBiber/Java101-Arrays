package ders07;

public class C03_Operators {
    public static void main(String[] args) {

        int a = 10;
        int b =15;

        System.out.println(a==b); // false
        System.out.println(a==b-5); // true

        boolean c;

        System.out.println(c=15==b); // true

        c=15*a==10*b;
        System.out.println(c); // true

        /*
        == ifadesi eşitliğin iki tarafındaki sayıların birbirlerine eşitmi
        sorusunu sorup true veya false cevabını almamaızı sağlar.
         */



    }
}
