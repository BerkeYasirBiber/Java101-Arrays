package ders21;

import java.util.Arrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {

        String[][] arr = {{"Ilker","Nesrin"},{"Hasan","Heysem","Adem","Yusuf Enes"}};

        String enuzunkelime = arr [0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j].length()>enuzunkelime.length()){
                    enuzunkelime=arr[i][j];
                }

                
            }
            
        }

        System.out.println(enuzunkelime);
    }
}
