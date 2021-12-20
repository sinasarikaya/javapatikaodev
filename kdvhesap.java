import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args) {
        int fiyat;
        Scanner inp = new Scanner(System.in);

        System.out.println("Ürünün fiyatını giriniz: ");
        fiyat = inp.nextInt();

        double kdv = ((fiyat*18)/100);
        double toplam = fiyat+kdv;
        System.out.println("Ürün Fiyatı: " + fiyat);
        System.out.println("KDV Ücreti: " + kdv);
        System.out.println("Toplam Ücret: " + toplam);

    }
}
