package Bridgelabz.Com.Basics;

public class PrimeNoSirConcept {
    static boolean checkPrimeNumber(int number){
        boolean isPrime = true;
        for (int i =2; i < number; i++){
            if (number % i ==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        boolean prime =  checkPrimeNumber(13);
        if (prime){
            System.out.println("prime");
        }else
            System.out.println("Not prime");

    }

}

