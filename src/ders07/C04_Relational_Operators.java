package ders07;

public class C04_Relational_Operators {
    public static void main(String[] args) {

        int a = 10;
        int b =15;

        System.out.println(a!=b); // true
        System.out.println(a!=b-5); // false

        boolean c;
        System.out.println(c=15!=b); //false

        c=15*a!=10*b;
        System.out.println(c); //false

        /*
        != ifadesi eşitliğin iki tarafındaki işlemlerin sonucunun birbirlerine eşit
         olmadığını söylüyor. true veya false cevabını almamaızı sağlar.
         */
    }
}
