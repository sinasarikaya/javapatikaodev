import java.util.Scanner;

public class ussualma3 {

    static int usalma(int n, int m) {
        int result = 1;
        for (int i = 1; i <= m; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        int n, m;
        Scanner inp = new Scanner(System.in);


        do {
            System.out.print("Taban değeri giriniz : ");
            n = inp.nextInt();
            System.out.print("Üs değerini giriniz : ");
            m = inp.nextInt();
            System.out.println("Sonuç : " + usalma(n, m));
            if (n == 0) {
                System.out.println("Taban 0 olamaz.");
            }
        }
        while (n != 0);


    }
}
