import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok = 1, i = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        if (n1 > n2) {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

        } else if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

        } else {
            System.out.printf("Sayılar eşit");

        }
       ekok=(n1 * n2) / ebob;;

        System.out.println("Sayıların ebobu: " + ebob);
        System.out.printf("Sayıların ekoku: " + ekok);
    }
}