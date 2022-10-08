package Bridgelabz.Com.Basics;

public class N_NaturalNumberSum {
    public static void checkSumOfN_NaturalNumber(int Number){
        int sum = 0;
        for (int i =0; i<=Number; i++)
            sum = sum+i;
        System.out.println("Sum of N Natural Number Is:"+sum);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum of N Natural Number :");
        checkSumOfN_NaturalNumber(6);

    }
}
//The positive integers or non-negative integers which
//Start from 1 and ends at infinity 1, 2, 3, 4, .....
//formula-sum of N natural Number s=n(n+1)/2


