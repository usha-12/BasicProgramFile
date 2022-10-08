package Bridgelabz.Com.Basics;

public class PrimeNumber{
    public static boolean checkPrimeNumber(int num){
        int count = 0;
        for (int i =2; i<num; i++){
            if (num%i==0){
                count=1;
                break;
            }
        }
        if (count==0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Prime Number program :");
        boolean count = checkPrimeNumber(22);

        if (count)
            System.out.println("Number is prime:");
        else
            System.out.println("Number is not Prime :");

    }
}
//prime Number-any number divisible by 1 and itself is called prime Number.
