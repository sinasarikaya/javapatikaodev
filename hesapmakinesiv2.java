import java.util.Scanner;


public class hesapmakinesiv2 {

    static int modalma(int a,int b){
        return a%b;
    }

    static void alancevre(int a,int b){
        System.out.println("Alan: " + a*b);
        System.out.println("Çevre: " + (a+b)*2);

    }


    public static void main(String[] args) {
        int a,b,islem;
        Scanner inp=new Scanner(System.in);
        System.out.println("Yapacağınız işlemi seçiniz:\n " + "1-Mod alma \n"  + " 2-Dikdörtgen alan ve çevresi \n" + " 3-Çıkış");
        islem= inp.nextInt();
        while (islem>1 && islem<3){
            if (islem == 3) {
                System.out.println("Güle Güle");
                break;
            }

            System.out.println("1.Sayı: ");
            a = inp.nextInt();
            System.out.println("2.Sayı: ");
            b = inp.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("Modu: " + modalma(a, b));
                    break;
                case 2:
                    alancevre(a, b);
                    break;
                default:
                    System.out.printf("Yanlış işlem seçtiniz.");
            }
        }
        if (!(islem>1 && islem<3)){
            System.out.println("Yanlış işlem seçtiniz. ");
        }
    }
}
