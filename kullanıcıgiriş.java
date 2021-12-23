import java.util.Scanner;

public class kullanıcıgiriş {
    public static void main(String[] args) {
        String kullaniciadi, sifre;
        int sifirlama;
        String yenikullaciadi, yenisifre;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        kullaniciadi = inp.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        sifre = inp.nextLine();

        if (kullaniciadi.equals("sinasarikaya") && sifre.equals("123123")) {
            System.out.printf("Başarılı bir şekilde giriş yaptınız");


        } else {
            System.out.printf("Kullanıcı adı veya şifreniz yanlış. Sıfırlamak ister misiniz? 1-Evet 2-Hayır \n");
            sifirlama = inp.nextInt();
            if (sifirlama == 1) {
                System.out.println("Yeni şifrenizi giriniz. ");
                yenisifre = inp.nextLine();
                if (yenisifre.equals("123123") || yenisifre.equals(sifre)) {
                    System.out.printf("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {

                    System.out.println("Şifre oluşturuldu. ");
                }
            }else if (sifirlama == 2) {
                System.out.println("Çıkış yapılıyor.");
            }
        }

    }
}
