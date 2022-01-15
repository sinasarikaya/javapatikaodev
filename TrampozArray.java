
public class TrampozArray {

    public static void print(int[][] dizi){
        for(int i=0;i< dizi.length;i++){
            for (int j=0;j< dizi[i].length;j++){
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] dizi={
                {2,3,4,4},
                {5,6,4,5}
        };

        int j= dizi.length;
        int i=dizi[0].length;

        int dizi2[][] = new int[i][j];

        for(i = 0; i < dizi.length; i++){
            for(j = 0; j < dizi[0].length; j++){
                dizi2[j][i] = dizi[i][j];
            }
        }

        print(dizi2);
    }
}
