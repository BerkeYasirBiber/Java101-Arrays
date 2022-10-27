package ders03;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");

        char ilkharf = scan.next().charAt(0); // charın içine yazdığım 0 kelimenin ilk harfi 1 yazsaydım 2.ci harfi 3 yazsaydım bla bla ..

        System.out.println("Kelimenizin ilk harfi :" + ilkharf);

    }
}
