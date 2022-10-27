package ders18;

class C04_ClassVeriables {


    public static void main(String[] args) {

        System.out.println(C03_classLevelVeriables.hastahaneismi);
        System.out.println(C03_classLevelVeriables.hastasayisi); //23453
        System.out.println(C03_classLevelVeriables.basHekimIsmi);

        C03_classLevelVeriables.hastasayisi++;
        C03_classLevelVeriables.hastasayisi++;

        method1();

        C03_classLevelVeriables.hastasayisi++;

        System.out.println(C03_classLevelVeriables.hastasayisi); // 23457

    }

    public static void method1(){

        C03_classLevelVeriables.hastasayisi++;
        System.out.println(C03_classLevelVeriables.hastasayisi); //23456

    }


}
