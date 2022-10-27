package ders15;

public class C08_stringConcate {
    public static void main(String[] args) {
        String birinci = "sanane";
        String ikinci = "banane";

        System.out.println(tekstring(birinci,ikinci));

    }


    public static String tekstring(String birinci,String ikinci){
        return birinci + " " + ikinci;

    }
}
