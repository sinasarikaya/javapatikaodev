import java.util.Scanner;

public class mukemmel {
    public static void main(String[] args) {
        int n,toplam=0,i;
        Scanner inp=new Scanner(System.in);
        System.out.printf("Bir sayı giriniz: ");
        n= inp.nextInt();

        for (i=1;i<n;i++){
            if(n%i==0){
                toplam+=i;
            }
        }
        if(toplam==n){
            System.out.printf(n + " Mükemmel sayıdır");
        }
        else{
            System.out.printf(n + " Mükemmel sayı değildir");
        }

    }
}
