import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.printf("Sayıyı giriniz: ");
        n= inp.nextInt();
        double sonuc=0;

        for(double i=1;i<=n;i++){
            sonuc+=(1/i);
        }
        System.out.print(sonuc);
    }
}
