import java.util.Scanner;

public class dongupratik1 {
    public static void main(String[] args) {
        int k,i=1,toplam=0,adet=0;
        Scanner inp=new Scanner(System.in);

        System.out.printf("Sayı giriniz: ");
        k= inp.nextInt();

        while (i<=k){
            i++;
            if(i%3==0 && i%4==0){
                toplam+=i;
                adet++;
            }
        }
        int sonuc=toplam/adet;
        System.out.print(sonuc);
    }
}
