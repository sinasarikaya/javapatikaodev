import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int birler=(number)%10;
        int onlar=(number/10)%10;
        int yuzler=(number/100)%10;
        int binler=(number/1000)%10;
        
        int result=birler+onlar+yuzler+binler;

        System.out.print(result);
    }
}