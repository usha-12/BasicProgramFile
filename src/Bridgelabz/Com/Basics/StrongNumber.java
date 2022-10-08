package Bridgelabz.Com.Basics;

public class StrongNumber {
    public static void checkStrong(int number){
        int strongNumber = 0;
        int storeValue = number;
        while (number>0){
            int fact = 1;
            int remainder = number % 10;
            while (remainder>=1){
                fact = fact*remainder;
                remainder--;
            }
            strongNumber = fact + strongNumber;
            number = number/10;
        }
        if (storeValue == strongNumber)
            System.out.println("number is strong:"+strongNumber);
        else
            System.out.println("number is not strong:"+strongNumber);

    }
    public static void main(String[] args) {

        System.out.println("Welcome to the Strong Number program");
        checkStrong(145);
    }
}
// 123 = 1!+2!+3!=1+2+6 = 9
// 145 = 1!+4!+5!=1+24+120 = 145
