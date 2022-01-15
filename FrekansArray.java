import java.util.Arrays;

public class FrekansArray {
    public static void main(String[] args) {
        int[] dizi={10,20,20,10,10,20,5,20};
        //5 10 10 10 20 20 20 20
        int n=1;
        int a=0;
        Arrays.sort(dizi);


        for(int i=0;i< dizi.length;i++){
            if(dizi[i]!=a){


            for(int j=0;j<dizi.length;j++){

                if ((i!=j) && (dizi[i]==dizi[j])) {
                    n++;
                    a=dizi[i];
                }
            }
            System.out.println(dizi[i] +" sayısı " + n + " kere tekrar edildi.");
            n=1;

        }
    }
    }
}
