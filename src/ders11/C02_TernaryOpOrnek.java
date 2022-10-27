package ders11;

import java.util.Scanner;

public class C02_TernaryOpOrnek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir harf giriniz");
        char girilenharf = scan.next().charAt(0);

        System.out.println(girilenharf>='a' && girilenharf<='z' ? (char)(girilenharf-32) : girilenharf);

        /*
        bu soruyu ascii-table bakarak cevapladık. char karakterlerinin sayı karşılıklarına ve
        örneğin A ve a sayı karşılıkları farklı ve sayı karşılıklarına göre en büyük z olurken
        en küçük a oluyor. büyük harflerde sayı karşılıklarına göre en büyük Z iken
        en küçük A harfi oluyor. ayrıca büyük harflerle küçük harfler arasında sayı farkı 32 dir.
        örneğin a = 97 iken A=65 ...
         */


    }
}
