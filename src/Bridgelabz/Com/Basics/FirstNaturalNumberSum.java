package Bridgelabz.Com.Basics;

public class FirstNaturalNumberSum {
    public static void sumFirstNaturalNumber(){
        int Number = 6;
        int Sum = 0;
        for (int i =1; i<=Number; i++)
            Sum=Sum+i;
        System.out.println("First N Natural Number Sum Is :"+Sum);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum of Natural Numbers : ");
        sumFirstNaturalNumber();


    }
}
//Natural numbers are counting numbers that start from 1. So, the first 10 natural numbers are 1, 2, 3, 4, 5, 6, 7, 8, 9,
// and 10. 0 is not a natural number, it is a whole number.

