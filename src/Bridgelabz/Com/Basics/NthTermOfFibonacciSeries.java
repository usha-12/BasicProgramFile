package Bridgelabz.Com.Basics;

import java.util.Scanner;

public class NthTermOfFibonacciSeries {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        int firstNo = 0;
        int secondNo = 1;
        for (int i = 1; i <= number; i++) {
            System.out.println(firstNo);
            int last2NoStore = firstNo + secondNo;//1-2
            firstNo = secondNo;//assign the value secondNo to firstNo
            secondNo = last2NoStore;
        }

    }
}
