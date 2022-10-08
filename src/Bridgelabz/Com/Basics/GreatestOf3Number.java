package Bridgelabz.Com.Basics;

import java.util.Scanner;

public class GreatestOf3Number {
    public static void checkGreatestOfThreeNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third Number:");
        int num3 = sc.nextInt();
        if (num1>=num2 && num1>=num3)
            System.out.println( "is the Greatest Number :"+num1);
        else if (num2>=num1 && num2>=num3)
            System.out.println( " is the Greatest Number : "+num2);
        else if (num3>=num1 && num3>=num2)
            System.out.println("Greatest Number : "+num3);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program Greatest among Three Numbers :");
        checkGreatestOfThreeNumbers();
    }
}
//Greatest of Three Number....

