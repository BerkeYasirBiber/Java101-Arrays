package ders23;

import java.util.ArrayList;
import java.util.List;

public class C02_FEL_Soru {
    public static void main(String[] args) {

        String[] arr = {"Sumeyra","Mehmet","Ekrem","Yilmaz","Olmaz"};
        List<String> yeniList = new ArrayList<>();



        for (String each:arr
             ) {

            if (each.length()%2==0){
                yeniList.add(each.substring(0,each.length()/2));

            }else {
                yeniList.add(each.substring((each.length()-1)/2));
            }

            
        }

        System.out.println(yeniList); // [eyra, Meh, rem, Yil, maz]


    }
}
