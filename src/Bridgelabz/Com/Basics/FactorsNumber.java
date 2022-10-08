package Bridgelabz.Com.Basics;

public class FactorsNumber {
    public static void checkFactors(int number){
        for (int i =1; i<=number; i++){
            if (number%i == 0)
                System.out.println("Factors:"+i);
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Factors Number program");
        checkFactors(10);
    }
}
// factor-divisible by number
// 10 ----> 1 2 5 10
