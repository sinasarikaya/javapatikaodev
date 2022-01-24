package MayınTarlası;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row,column;
        Scanner inp=new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println("Boyutları giriniz!");
        System.out.println("Satır sayısı: ");
        row= inp.nextInt();
        System.out.println("Sütün sayısı:");
        column= inp.nextInt();
        MineSweeper mine=new MineSweeper(row,column);
        mine.run();

    }
}
