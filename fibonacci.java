import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int x=0,y=1,i,n,toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Eleman sayısı girin: ");
        n=inp.nextInt();

        System.out.print(x +" "+y+" ");
        for (i=1;i<n;i++){
            toplam=x+y;
            System.out.print(toplam + " ");
            x=y;
            y=toplam;

        }

    }
}
