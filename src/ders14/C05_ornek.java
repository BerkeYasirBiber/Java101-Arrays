package ders14;

public class C05_ornek {
    public static void main(String[] args) {

        String input="Java ne kadar guzel";

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));
        }

        System.out.println("");

        String input1="Java her gecen gun guzellesiyor";
        String tersInput="";

        for (int i = input1.length()-1; i >=0 ; i--) {

            tersInput += input1.substring(i,i+1);
            
        }

        System.out.println("Ters hali : " + tersInput);









    }
}
