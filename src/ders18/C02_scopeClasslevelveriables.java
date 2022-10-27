package ders18;

import com.sun.source.tree.Scope;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class C02_scopeClasslevelveriables {

    static String hastahaneismi="Yildiz hastahanesi";
    static int hastasayisi=23453;
    static String basHekimIsmi;
    String persIsmi;
    String persTelefonu;
    int persYasi;


    public static void main(String[] args) {
        System.out.println(hastahaneismi);
        System.out.println(basHekimIsmi);

    C02_scopeClasslevelveriables personel = new C02_scopeClasslevelveriables();
        personel.persIsmi="Berke";
        System.out.println(personel.persIsmi);

        method1();




    }


    public static void method1(){
        System.out.println(hastasayisi);
        hastasayisi++;

        C02_scopeClasslevelveriables personel = new C02_scopeClasslevelveriables();
        personel.persIsmi="Numan";
        System.out.println(personel.persIsmi);


    }

    public void method2(){
        System.out.println(basHekimIsmi);
        System.out.println(persIsmi);
        System.out.println(persTelefonu);
        System.out.println(persYasi);

        hastasayisi++;
        persYasi--;


    }


}
