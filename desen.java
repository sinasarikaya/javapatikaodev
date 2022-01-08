import java.util.Scanner;

public class desen {

    static int dongueksi(int n,int temp) {
        System.out.print(n + " ");
        if (n <= 0) {
            return donguarti(n+5, temp);
        } else {
            return dongueksi(n - 5, temp);
        }
    }

    static int donguarti(int n,int temp){
        System.out.print(n + " ");
        if(n==temp){
            return 0;
        }
        else {
        return donguarti(n+5,temp)    ;
    }
    }

    public static void main(String[] args) {
        int n,temp;
        Scanner inp=new Scanner(System.in);

        System.out.print("N sayısı : ");
        n= inp.nextInt();
        temp=n;
        dongueksi(n,temp);
    }
}
