import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut=2.14, elma = 3.67, domates = 1.11, muz= 0.95, patlıcan = 5.00;
        double armutadet,elmaadet,domatesadet,muzadet,patlıcanadet;
        Scanner inp=new Scanner(System.in);

        System.out.printf("Armut kaç kilo ? ");
        armutadet= inp.nextDouble();
        System.out.printf("Elma kaç kilo ? ");
        elmaadet= inp.nextDouble();
        System.out.printf("Domates kaç kilo ? ");
        domatesadet= inp.nextDouble();
        System.out.printf("Muz kaç kilo ? ");
        muzadet= inp.nextDouble();
        System.out.printf("Patlıcan kaç kilo ? ");
        patlıcanadet= inp.nextDouble();

        double toplam=(armut*armutadet)+(elma*elmaadet)+(domatesadet*domates)+(muz*muzadet)+(patlıcan*patlıcanadet);

        System.out.printf("Toplam Ücret: " + toplam);


    }
}
