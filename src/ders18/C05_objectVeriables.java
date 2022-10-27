package ders18;

public class C05_objectVeriables {

    public static void main(String[] args) {

        C03_classLevelVeriables pers1 = new C03_classLevelVeriables();

        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);
        System.out.println(pers1.persTelefonu);

        pers1.persIsmi="Suleyman";
        pers1.persYasi=35;
        pers1.persTelefonu="555.345.67.54";

        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);
        System.out.println(pers1.persTelefonu);

        C03_classLevelVeriables pers2 = new C03_classLevelVeriables();
        pers2.persIsmi="Latife";
        System.out.println(pers2.persIsmi);



    }
}
