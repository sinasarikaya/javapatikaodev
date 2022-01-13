package java101patika;

public class harmonikarray {
    public static void main(String[] args) {
        double[] dizi={1,3,5,7};
        double sum=0;

        for (int i=0;i< dizi.length;i++){
            sum+=1/dizi[i];
        }
        double harAvarage= dizi.length/sum;
        System.out.println("Harmonik ortalamaları: " + harAvarage);
    }
}
