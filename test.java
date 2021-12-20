import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       int mat,fizik,kimya,turkce;

       Scanner inp=new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        mat=inp.nextInt();

        System.out.println("Fizik notunu giriniz: ");
        fizik=inp.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        kimya=inp.nextInt();

        System.out.println("Türkçe notunu giriniz: ");
        turkce=inp.nextInt();

        double toplam = ( mat+fizik+kimya+turkce );
        double sonuc = toplam/4.0;
        String gectikaldi = sonuc>=65 ? "Geçti" : "Kaldı" ;

        System.out.print("Ortalamanız: " + sonuc + " " + gectikaldi );
    }
}
