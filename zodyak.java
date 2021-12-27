import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {
        int dogumYil,modsonuc;
        Scanner inp=new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYil=inp.nextInt();
        modsonuc=dogumYil%12;

        switch (modsonuc){
            case 0:
                System.out.print("Çin Zodyağı burcunuz: Maymun");
            break;

            case 1:
                System.out.print("Çin Zodyağı burcunuz: Horoz");
                break;

            case 2:
                System.out.print("Çin Zodyağı burcunuz: Köpek");
                break;

            case 3:
                System.out.print("Çin Zodyağı burcunuz: Domuz");
                break;

            case 4:
                System.out.print("Çin Zodyağı burcunuz: Fare");
                break;

            case 5:
                System.out.print("Çin Zodyağı burcunuz: Öküz");
                break;

            case 6:
                System.out.print("Çin Zodyağı burcunuz: Kaplan");
                break;

            case 7:
                System.out.print("Çin Zodyağı burcunuz: Tavşlan");
                break;

            case 8:
                System.out.print("Çin Zodyağı burcunuz: Ejderha");
                break;

            case 9:
                System.out.print("Çin Zodyağı burcunuz: Yukan");
                break;

            case 10:
                System.out.print("Çin Zodyağı burcunuz: At");
                break;

            case 11:
                System.out.print("Çin Zodyağı burcunuz: Koyun");
                break;

            default:
                System.out.print("Hatalı Giriş");
        }

    }
}
