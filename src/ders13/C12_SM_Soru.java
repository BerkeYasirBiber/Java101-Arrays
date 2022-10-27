package ders13;

public class C12_SM_Soru {
    public static void main(String[] args) {

        String mail ="brkysrbbrmail.com";


        if(!mail.contains("@")){
            System.out.println("gecersiz email");
        }else if(!mail.contains("@gmail.com")){
            System.out.println("gmail adresi giriniz");
        }else if(!mail.endsWith("@gmail.com")){
            System.out.println("Yazim hatasi");
        }else System.out.println("mail basarili kaydedildi");

        /*
        baslara koyduğumuz !'ler  ''içermiyorsa''  anlamı katar. yani olumsuzluk anlamı katar.
        mesela != yaptığımızda iki taraf birbirine eşit değil der gibi...
         */




    }
}
