package ders19;

public class C05_Arrays {
    public static void main(String[] args) {

        int[] arr ={1,2,4,5,3,6,7,4,2,3,5,1,3,2};
        int arananeleman = 2;

       arraydeelemanarama(arr,arananeleman);

    }

    public static void arraydeelemanarama(int[] arr, int arananeleman){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==arananeleman){
                sayac++;

            }


        }




        System.out.println(sayac); // 3




    }
}
