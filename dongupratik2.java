import java.util.Scanner;

public class dongupratik2 {
    public static void main(String[] args) {
       int i,toplam=0;
       Scanner inp=new Scanner(System.in);



        do{
            System.out.printf("Sayı giriniz: ");
            i=inp.nextInt();

            if(i%4==0){
                toplam+=i;

            }


        }
        while (i%2==0);
        System.out.print(toplam);
    }
}
