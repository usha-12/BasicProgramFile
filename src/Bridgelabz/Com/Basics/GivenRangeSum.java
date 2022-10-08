package Bridgelabz.Com.Basics;

public class GivenRangeSum {
    public static void checkGivenRangeSum(int Number1, int Number2){
        int sum =0;
        for (int i =Number1; i<=Number2; i++)
            sum=sum+i;
        System.out.println("The sum is : "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program Sum of the Number Given Range :");
        checkGivenRangeSum(20,30);

    }
}


