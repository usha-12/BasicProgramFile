package Bridgelabz.Com.Basics;

public class ReverseNumber {
    public static void checkReverseNumber(int number){
        int reverse;
        while (number>0){
            reverse = number%10;
            number = number / 10;
            System.out.println("\tReverse Number Is :"+reverse);
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse number program:");
        checkReverseNumber(12678789);

    }
}

