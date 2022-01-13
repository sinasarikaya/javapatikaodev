public class minmaxarray {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int n = 60;
        int min = 0;
        int max = list[0];

        for (int i : list) {
            if (i < n) {
                if(i>min){
                    min=i;
                }
            }
           if (i > n) {
                if(i<max) {
                    max=i;
                }
            }
        }
        System.out.println("Girilen Sayı: " + n);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);

    }
}