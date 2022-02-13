import java.util.Scanner;

public class Game {
    private Scanner inp=new Scanner(System.in);

    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz !");
        System.out.println("Lütfen bir isim giriniz: ");
        //String playerName=inp.nextLine();
        Player player=new Player("sina");
        System.out.println(player.getName() + " Hoşgeldiniz !");
        System.out.println("Karakter seçiniz: ");
        System.out.println("-----------------------------------------");
        player.selectChar();

        Location location=null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("###### Bölgeler ######");
            System.out.println();
            System.out.println("1- Güvenli ev");
            System.out.println("2- Mağaza");
            System.out.println("3- Mağara");
            System.out.println("4- Orman");
            System.out.println("5- Nehir");
            System.out.println("0- Çıkış yap");
            System.out.print("Lütfen gitmekl istediğiniz bölgeyi seçin: ");
            int selectLoc=inp.nextInt();
            switch (selectLoc){
                case 0:
                    location=null;
                    break;
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:
                    location=new ToolStore(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;

                default:
                    System.out.println("Lütfen geçerli bir bölge girin.");
            }

            if(location==null){
                System.out.println("Oyun bitti ");
                break;
            }

            if (!location.onLocation()){
                System.out.println("Game OVER!");
                break;
            }

        }

    }

}
