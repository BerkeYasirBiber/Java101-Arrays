package ders13;

public class C14_SM_LastIndexOf {
    public static void main(String[] args) {

        String str = "Java hafiften beyin yakiyor";

        System.out.println(str.lastIndexOf("a")); // 21

        /*
        aramaya sonda başladı ama index'i baştan başlayarak verdi 21 verdi.
        yani sondan başa doğru demek lastindexof
         */

        System.out.println(str.lastIndexOf("e")); // 15

        System.out.println(str.lastIndexOf("beyin")); // 14


    }
}
