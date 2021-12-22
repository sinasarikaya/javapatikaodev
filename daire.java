import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double pi=3.14,r;
        Scanner inp=new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r=inp.nextDouble();
        double cevre=2*pi*r;
        double alan=pi*r*r;
        System.out.println("Dairenin Çevresi; " + cevre);
        System.out.println("Dairenin Alanı; " + alan);
    }
}
