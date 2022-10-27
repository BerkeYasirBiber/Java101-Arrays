package ders14;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        int sayi=1455497823;
        String sayiStr=""+sayi;

        int birlerbasamagi=0;
        int rakamlartoplami=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {
            birlerbasamagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;
        }

        System.out.println(rakamlartoplami);
        
    }
}
