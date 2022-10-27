package ders13;

public class C15_SM_IsEmpty {
    public static void main(String[] args) {

        String str = "";
        System.out.println(str.isEmpty()); // true

        str = "   ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true

        str=" x";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false

        /*
        isEmpty   dolumu boşmu metnin içi ona bakıyor.
        isBlank   içinde karakter varsa false yoksa tamamen space(boşluk)
                    varsa true. Boşluklardan oluşuyorsa blank.
         */











    }
}
