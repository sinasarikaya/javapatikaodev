import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int n,r,i,totaln=1,totalr=1,sonuc,neksirfak,neksirfaksonuc=1;
        Scanner inp=new Scanner(System.in);

        System.out.print("N eleman sayısını giriniz: ");
        n= inp.nextInt();
        System.out.print("R eleman sayısını giriniz: ");
        r= inp.nextInt();
        neksirfak=n-r;
        for(i=1;i<=n;i++){
            totaln=totaln*i;
        }
        for(i=1;i<=r;i++){
            totalr=totalr*i;
        }
        for (i=1;i<=neksirfak;i++){

            neksirfaksonuc=neksirfaksonuc*i;
        }


        sonuc=totaln/(totalr*neksirfaksonuc);
        System.out.printf("N ve r kombinasyonu: " + sonuc);



    }
}
