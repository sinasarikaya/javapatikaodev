import java.util.Scanner;
import java.util.Arrays;

public class SıralamaArray {
    public static void main(String[] args) {
        int n,elemanlar;
        Scanner inp=new Scanner(System.in);


        System.out.print("Dizinin boyutu n : " );
        n= inp.nextInt();
        int[] dizi=new int[n];
        System.out.println("Dizinin elemanlarını giriniz : " );

        for(int i=0;i<n;i++){
            System.out.printf((i+1) +". Elemanı : ");
            elemanlar= inp.nextInt();
            dizi[i]=elemanlar;
        }
        Arrays.sort(dizi);
        System.out.print("Sıralama : " + Arrays.toString(dizi));

    }
}
