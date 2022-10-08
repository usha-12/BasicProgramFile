package Bridgelabz.Com.Basics;

public class FactorialNumber {
    public static void checkFactorialNumber(int number){
        int Factorial = 1;
        for (int i = 1; i<=number; i++){
            Factorial = Factorial*i;
        }
        System.out.println("Factorial is :"+Factorial);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Factorial Number program");
        checkFactorialNumber(5);
    }
}
// input - 5----> 120 (5*4*3*2*1)
