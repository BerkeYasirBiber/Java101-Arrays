package ders13;

public class C01_String_Manipulations {
    public static void main(String[] args) {

        String str = "Java Mutluluktur";
        System.out.println(str.toUpperCase()); // Büyük harfle yazdırdık. ama kalıcı olmadı
        System.out.println(str); // küçük harfle yazdırdı.
        str=str.toUpperCase(); // burada büyük harfle yazdırmayı kalıcı hale getirdik.
        System.out.println(str); // büyük harfle yazdırdık.

        str=str.toLowerCase(); // küçük harflere çevirdik.
        System.out.println(str); // küçük harflerle yazdırdık.


























    }
}
