import java.util.Scanner;

public class havasicaklik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp=new Scanner(System.in);

        System.out.printf("Hava sıcaklığını giriniz: ");
        sicaklik= inp.nextInt();

        if(sicaklik<5){
            System.out.printf("Kayak yapabilirsiniz.");
        }
        else if(sicaklik>=5 && sicaklik<10){
            System.out.printf("Sinemaya gidebilirsiniz.");
        }
        else if(sicaklik>=10 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.printf("Piknik  yapabilirsiniz.");
        }
        else if(sicaklik>15 && sicaklik<=25){
            System.out.printf("Piknik  yapabilirsiniz.");
        }
        else if(sicaklik>25){
            System.out.printf("Yüzmeye gidebilirsiniz.");
        }

    }
}
