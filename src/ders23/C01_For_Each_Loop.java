package ders23;

public class C01_For_Each_Loop {
    public static void main(String[] args) {

        int[] arr = {3,5,7,8,4,2,6,9,6,4,5};
        int toplam = 0;

        for (int each: arr
             ) {
            if (each>5){
                toplam+=each;
            }
        }

        System.out.println(toplam);

    }
}
