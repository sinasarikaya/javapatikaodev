package java101patika;

public class polindromsayi {
    static boolean isPolindrome(int number){
        int tempNum=number,lastNumber,reverseNumber=0;

        while (tempNum!=0){
            lastNumber=tempNum%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            tempNum/=10;
        }

        if(reverseNumber==number)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(isPolindrome(101));
    }
}
