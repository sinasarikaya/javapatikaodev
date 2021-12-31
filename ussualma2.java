import java.util.Scanner;

public class ussualma2 {
    public static void main(String[] args) {
        int n,k,i,total=1;
        Scanner inp=new Scanner(System.in);

        System.out.printf("Üssü alınacak Sayı: ");
        n= inp.nextInt();
        System.out.printf("Sayının üssü: ");
        k= inp.nextInt();


        for(i=1;i<=k;i++){
            total*=n;
        }


        System.out.printf("Sonuç: " + total);

    }
}
