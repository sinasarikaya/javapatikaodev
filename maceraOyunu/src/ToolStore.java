public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------ Mağazaya Hoşgeldiniz ! -----");
        boolean showMenu =true;
        while (showMenu){
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış");
            System.out.print("Seçimiz: ");
            int selectCase = Location.inp.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz, tekrar giriniz: ");
                selectCase = inp.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;

                case 3:
                    System.out.println("Bir daha bekleriz...");
                    showMenu=false;
                    break;

            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("----- Silahlar -----");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + "\t Para: " + w.getPrice() + "\t Hasar: " + w.getDamage());
        }
        System.out.println("0- Çıkış yap");

    }

    public void buyWeapon() {

        System.out.print("Bir silah seçiniz: ");

        int selectWeaponID = inp.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz, tekrar giriniz: ");
            selectWeaponID = inp.nextInt();
        }

        if(selectWeaponID!=0){

            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedWeapon.getName() + " Silahını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }
        }

        }



    public void printArmor() {
        System.out.println("----- Zırhlar -----");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName() + "\t Para: " + a.getPrice() + "\t Zırh: " + a.getBlock());
        }
        System.out.println("0- Çıkış yap");
    }

    public void buyArmor() {

        System.out.print("Bir zırh seçiniz: ");

        int selectArmorID = inp.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println("Geçersiz, tekrar giriniz: ");
            selectArmorID = inp.nextInt();

        }

       if(selectArmorID!=0){
           Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

           if (selectedArmor != null) {
               if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                   System.out.println("Yeterli paranız bulunmamaktadır.");
               } else {
                   System.out.println(selectedArmor.getName() + " Zırhını satın aldınız.");
                   this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                   this.getPlayer().getInventory().setArmor(selectedArmor);
                   System.out.println("Kalan paranız: " + this.getPlayer().getMoney());

               }

           }

       }
    }
}
