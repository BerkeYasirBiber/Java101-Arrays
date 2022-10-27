package ders15;

public class C09_stringTerseCevirme {
    public static void main(String[] args) {

        String str1="java kod yazdikca ogrenilir";
        System.out.println(tersinecevir(str1));

    }

    public static String tersinecevir(String str1){

        String tersStr="";
        for (int i = str1.length()-1 ; i >=0 ; i--) {

            tersStr=tersStr+str1.charAt(i);

        }
        return tersStr;

    }
}
