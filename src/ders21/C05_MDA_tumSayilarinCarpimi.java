package ders21;

public class C05_MDA_tumSayilarinCarpimi {
    public static void main(String[] args) {

        int[][] arr = {{5,7},{5,8,9},{0,1}};

        elementlericarp(arr);

    }

    public static int elementlericarp(int[][] arr){

        int sayilarincarpimi = 1;

        for (int i = 0; i <arr.length ; i++) {



            for (int j = 0; j <arr[i].length ; j++) {

                sayilarincarpimi *= arr[i][j];

            }

        }

        System.out.println(sayilarincarpimi);

        return  sayilarincarpimi;
    }
}
