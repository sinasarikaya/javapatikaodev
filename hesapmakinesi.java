import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int deger1,deger2,select,toplama,cikarma,bolme,carpma;
        Scanner inp=new Scanner(System.in);

        System.out.print("İlk değeri giriniz: ");
        deger1=inp.nextInt();
        System.out.print("İkinci değeri giriniz: ");
        deger2=inp.nextInt();

        System.out.println("İşlem seçiniz: 1-Toplama 2-Çıkarma 3-Bölme 4-Çarpma ");
        select=inp.nextInt();

        switch (select){

            case 1:
                toplama=deger1+deger2;
                System.out.print(toplama);
                break;
            case 2:
                cikarma=deger1-deger2;
                System.out.print(cikarma);
                break;
            case 3:
                if (deger2!=0){
                bolme=deger1/deger2;
                System.out.print(bolme);}
                else if (deger2==0){
                    System.out.print("Bir Sayı 0'a bölünemez");
                }
                break;
            case 4:
                carpma=deger1*deger2;
                System.out.print(carpma);
                break;
            default:
                System.out.print("Yanlış seçim yaptınız.");

        }


    }
}
