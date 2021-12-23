import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        int ay,gun;
        Scanner inp=new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz: ");
        ay=inp.nextInt();
        System.out.println("Doğduğunuz günü giriniz: ");
        gun=inp.nextInt();

        if(ay==1){
            if(gun>=1 && gun<=31){
                if(gun<22){
                    System.out.println("Burcunuz Oğlak");
                }
                else{
                    System.out.println("Burcunuz Kova");
                }

            }
            else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }

        if(ay==2){
            if(gun>=1 && gun<=28){
                if(gun<20){
                    System.out.println("Burcunuz Kova");
                }
                else{
                    System.out.println("Burcunuz Balık");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==3){
            if(gun>=1 && gun<=31){
                if(gun<21){
                    System.out.println("Burcunuz Balık");
                }
                else{
                    System.out.println("Burcunuz Koç");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==4){
            if(gun>=1 && gun<=31){
                if(gun<21){
                    System.out.println("Burcunuz Koç");
                }
                else{
                    System.out.println("Burcunuz Boğa");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==5){
            if(gun>=1 && gun<=31){
                if(gun<22){
                    System.out.println("Burcunuz Boğa");
                }
                else{
                    System.out.println("Burcunuz İkizler");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==6){
            if(gun>=1 && gun<=31){
                if(gun<23){
                    System.out.println("Burcunuz İkizler");
                }
                else{
                    System.out.println("Burcunuz Yengeç");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==7){
            if(gun>=1 && gun<=31){
                if(gun<23){
                    System.out.println("Burcunuz Yengeç");
                }
                else{
                    System.out.println("Burcunuz Aslan");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==8){
            if(gun>=1 && gun<=31){
                if(gun<23){
                    System.out.println("Burcunuz Aslan");
                }
                else{
                    System.out.println("Burcunuz Başak");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==9){
            if(gun>=1 && gun<=31){
                if(gun<23){
                    System.out.println("Burcunuz Başak");
                }
                else{
                    System.out.println("Burcunuz Terazi");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==10){
            if(gun>=1 && gun<=31){
                if(gun<23){
                    System.out.println("Burcunuz Terazi");
                }
                else{
                    System.out.println("Burcunuz Akrep");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==11){
            if(gun>=1 && gun<=31){
                if(gun<22){
                    System.out.println("Burcunuz Akrep");
                }
                else{
                    System.out.println("Burcunuz Yay");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        if(ay==12){
            if(gun>=1 && gun<=31){
                if(gun<22){
                    System.out.println("Burcunuz Yay");
                }
                else{
                    System.out.println("Burcunuz Oğlak");
                }

            } else {
                System.out.println("Hatalı gün girdiniz.");
            }
        }
        else if (!(ay>=1 && ay<=12)){
            System.out.println("Hatalı tarih girdiniz.");
        }
    }
}
