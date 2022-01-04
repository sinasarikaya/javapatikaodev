import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int i=1,n,a,min,max;
        Scanner inp=new Scanner(System.in);
        System.out.printf("Kaç tane sayı gireceksiniz: ");
        n=inp.nextInt();
        System.out.printf(i + ".Sayıyı giriniz: ");
        a=inp.nextInt();
        min=a;
        max=a;

        for(i=2;i<=n;i++){
            System.out.printf(i + ".Sayıyı Giriniz: ");
            a=inp.nextInt();

            if(a>max){
                max=a;
            }
            if (a<min){
                min=a;
            }

        }
        System.out.println("En büyük sayı: " + max );
        System.out.printf("En küçük sayı: " + min );
    }
}
