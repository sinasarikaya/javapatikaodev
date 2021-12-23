import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        int mat,fizik,turkce;
        double ort;
        Scanner inp=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat=inp.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik=inp.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce=inp.nextInt();
        

        ort=(mat+fizik+turkce)/3;


        if(ort>=55){
            System.out.println("Tebrikler sınıfı geçtiniz");
        }
        else{
            System.out.println("Sınıfta kaldınız");
        }
        System.out.println("Ortalamanız " + ort);
    }
}
