package ders20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_A_stringSplit {
    public static void main(String[] args) {

        String str = "java gercekten cok cok guzel";

        String[] kactaneEvar = str.split("e");
        System.out.println(Arrays.toString(kactaneEvar)); // [java g, rc, kt, n cok cok guz, l]
        System.out.println(kactaneEvar.length-1); // 4

    }
}
