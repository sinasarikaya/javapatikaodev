import java.util.Scanner;

public class pisagor {
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.println("1.Dik kenar uzunluğu; ");
        a = inp.nextDouble();
        System.out.println("2.Dik kenar uzunluğu; ");
        b = inp.nextDouble();
        double sonuc=((a*a)+(b*b));
        c = Math.sqrt(sonuc);
        System.out.println("Hipotenüs uzunluğu: " + c );
    }
}
