import java.util.Scanner;

public class sayisiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);

        System.out.printf("1.Sayıyı giriniz: ");
        a= inp.nextInt();
        System.out.printf("2.Sayıyı giriniz: ");
        b= inp.nextInt();
        System.out.printf("3.Sayıyı giriniz: ");
        c= inp.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            }
            else{
                System.out.printf("a>c>b");
            }
        }
        if(b>a && b>c){
            if(a>c){
                System.out.println("b>a>c");
            }
            else{
                System.out.printf("b>c>a");
            }
        }
        if(c>b && c>a){
            if(b>a){
                System.out.println("c>b>a");
            }
            else{
                System.out.printf("c>a>b");
            }
        }
    }
}
