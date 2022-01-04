import java.util.Scanner;

public class asalsayi {
    public static void main(String[] args) {
        int i,k;
        boolean sonuc=false;

        for(i=2;i<100;i++){
            sonuc=true;
            for(k=2;k<i/2;k++){
                if(i%k==0){
                    sonuc=false;
                    break;
                }
            }
            if(sonuc){
                System.out.printf(i +" ");
            }
        }
    }
}
