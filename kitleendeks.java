import java.util.Scanner;

public class kitleendeks {
    public static void main(String[] args) {
        double boy,kilo,endeks;
        Scanner inp=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy= inp.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo= inp.nextDouble();

        endeks=(kilo)/(boy*boy);

        System.out.println("Vücüt kitle endeksiniz: " + endeks );
    }
}
