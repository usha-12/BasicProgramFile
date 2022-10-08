package Bridgelabz.Com.Basics;

public class PrimeNumberInRange {
    public static void checkPrimeInRange(int initialLimit, int finalLimit){
        for (int i =initialLimit;i<=finalLimit;i++){
            boolean isPrime= PrimeNumber.checkPrimeNumber(i);
            if (isPrime)
                System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        checkPrimeInRange(12,20);

    }
}

