package ders07;

public class C01_Concatenation {
    public static void main(String[] args) {

        String a = "Hello";
        int b = 2;
        int c = 3;

        System.out.println(a+b+c); // hello23
        System.out.println(c+b+a); //5hello
        System.out.println(a+(b+c)); //hello5
        System.out.println(a+b*c); //hello6

        /*
        parantez içindeki işlemler soldan başlayarak yapılır.string bir ifade
        başta olursa toplamada string bir ifade toplanmayacağı için yanyana yazılır.
        matematikte işlem önceliği parantez içinindir. yine;
        matematikte işlem önceliği toplamadan önce çarpma işlemidir.

         */

    }
}
