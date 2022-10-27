package ders13;

import jdk.swing.interop.SwingInterOpUtils;

public class C07_SM_SubString2 {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));
        /*
        5.harften başladı 5,6,7 yazdırdı 8. harfi yazdırmadı.
        5. index dahil 8. index hariç
         */

        String isim = "HASAN";

        System.out.println(isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()); // Hasan




    }
}
