import java.util.Scanner;

public class ucakbilet {
    public static void main(String[] args) {
        int mesafe,yas,tip;
        double normaltutar,yasindirim,sontutar,gidisdonus,ucret=0.10;
        Scanner inp=new Scanner(System.in);


        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe=inp.nextInt();

        System.out.print("Yaşınızı giriniz :");
        yas=inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip=inp.nextInt();

        if(tip==1){
            if(yas>0 && yas<12){
                normaltutar=mesafe*ucret;
                yasindirim=normaltutar*0.50;
                sontutar=normaltutar-yasindirim;
                System.out.println("Toplam Tutar: " + sontutar + "TL");

            }
            if(yas>=12 && yas<=24){
                normaltutar=mesafe*ucret;
                yasindirim=normaltutar*0.10;
                sontutar=normaltutar-yasindirim;
                System.out.println("Toplam Tutar: " + sontutar + "TL");

            }
            if(yas>24 && yas<=65){
                normaltutar=mesafe*ucret;
                sontutar=normaltutar;
                System.out.println("Toplam Tutar: " + sontutar + "TL");

            }
            if(yas>65){
                normaltutar=mesafe*ucret;
                yasindirim=normaltutar*0.30;
                sontutar=normaltutar-yasindirim;
                System.out.println("Toplam Tutar: " + sontutar + "TL");

            }
            if(yas>150){
                System.out.printf("Hatalı Veri Girdiniz!");
            }

        }
        if(tip==2){
            if(yas>0 && yas<12){
                normaltutar=mesafe*ucret;
                yasindirim=normaltutar*0.50;
                sontutar=normaltutar-yasindirim;
                gidisdonus=(sontutar*0.20);
                sontutar=(sontutar-gidisdonus)*2;
                System.out.println("Toplam Tutar: " + sontutar + "TL");
            }
            if(yas>=12 && yas<=24){
                normaltutar=mesafe*ucret;
                yasindirim=normaltutar*0.10;
                sontutar=normaltutar-yasindirim;
                gidisdonus=(sontutar*0.20);
                sontutar=(sontutar-gidisdonus)*2;
                System.out.println("Toplam Tutar: " + sontutar + "TL");

            }
            if(yas>24 && yas<=65){
                normaltutar=mesafe*ucret;
                gidisdonus=(normaltutar*0.20);
                sontutar=(normaltutar-gidisdonus)*2;
                System.out.println("Toplam Tutar: " + sontutar + "TL");

            }
            if(yas>65){
                normaltutar=mesafe*ucret;
                yasindirim=normaltutar*0.30;
                sontutar=normaltutar-yasindirim;
                gidisdonus=(sontutar*0.20);
                sontutar=(sontutar-gidisdonus)*2;
                System.out.println("Toplam Tutar: " + sontutar + "TL");

            }
            if(yas>150){
                System.out.printf("Hatalı Veri Girdiniz!");
            }

        }

        else if (!(tip==1 || tip==2)){
            System.out.printf("Hatalı Veri Girdiniz!");

        }
        }


    }

