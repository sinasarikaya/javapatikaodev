import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        int yil;
        Scanner inp=new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yil= inp.nextInt();


        if(yil%4==0){
            if (yil%400<100){
                System.out.printf(yil + " bir artık yıldır !");

            }
            else {
                System.out.printf(yil + " bir artık yıldır değildir !");
            }

        }
        else{

            System.out.printf(yil + " bir artık yıldır değildir !");
        }
    }
}
