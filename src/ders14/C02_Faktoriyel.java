package ders14;

public class C02_Faktoriyel {
    public static void main(String[] args) {
        
        int sayi = 10;
        int faktoriyel = 1;

        for (int i = sayi; i > 1; i--){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);


        int toplamdeger=0;

        for (int i = 1; i <101 ; i++) {
                toplamdeger=toplamdeger+i;
        }
        System.out.print(toplamdeger);

            
    }
}

