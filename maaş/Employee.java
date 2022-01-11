package maaş;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax=0;
    int bonus=0;
    int salaryincrease=0;
    int newsalary;
    int totalsalary;


    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public int tax() {
        if (salary < 1000) {
            return tax;
        } else  {
            return tax=(salary*3)/100 ;
        }
    }
    public int bonus()
        {
            if(workHours>40){
                return bonus=(workHours-40)*30;
            }
            else {
                return bonus;
            }
        }

    public int raiseSalary(){
        int currentYear=2021;

        if((currentYear-hireYear)<10){
            return salaryincrease=(salary*5)/100;
        }
        else if (((currentYear-hireYear)>9) && ((currentYear-hireYear)<20)){
            return salaryincrease=(salary*10)/100;
            }
        else if ((currentYear-hireYear)>19){
            return salaryincrease=(salary*15)/100;
        }
        else {
            return salaryincrease;
        }
        }

        public int getNewsalary(){
        return newsalary=(salary+bonus)-tax;

        }

        public int totalsalary(){
        return totalsalary=salary+salaryincrease;

        }


   public void printscore(){
       System.out.println("Adı: " + this.name);
       System.out.println("Maaşı: " + this.salary);
       System.out.println("Çalışma Saati: " + this.workHours);
       System.out.println("Başlangıç yılı: " + this.hireYear);
       System.out.println("Vergi: " + tax());
       System.out.println("Bonus: " + bonus());
       System.out.println("Maaş artışı: " + raiseSalary());
       System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + getNewsalary());
       System.out.println("Toplam maaş: " + totalsalary());
   }

    }



