package ders14;

public class C01_forLoops {
    public static void main(String[] args) {


        for (int i = 0; i <= 10 ; i++) {
           System.out.print(i + " " );
       }

        System.out.println("");

        for (int i = 10; i <100 ; i++) {

            if(i%7==0){
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        for (int j = 13; j <100 ; j+=7) {
            System.out.print( j + " ");

        }

        System.out.println("");

        for (int i = 1; i <10 ; i++) {
            System.out.print(i*i + " ");

        }



    }


}

