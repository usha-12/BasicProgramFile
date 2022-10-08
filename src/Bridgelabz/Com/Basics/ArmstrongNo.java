package Bridgelabz.Com.Basics;

import java.util.Scanner;

public class ArmstrongNo {
    public static boolean checkArmstrongNumber(int number){
        int armstrong = 0;
        int storeValue = number;
        while (number>0){
            int remainder=number % 10;
            armstrong = (int)Math.pow(remainder,3)+armstrong;//pow return-double
            number = number/10;
        }
        if (storeValue == armstrong)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Armstrong Number Given Range program ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int number = sc.nextInt();
        boolean b = checkArmstrongNumber(number);
        if (b)
            System.out.println("Number is Armstrong:");
        else
            System.out.println("Number not armstrong");

    }
}
//a number that is equal to the sum of cubes of its digits called armstrong number
/*1. 153, 370, 371, 407
 * result-1*1*1 + 5*5*5 + 3*3*3 = 1+125+27=153
 * 2. 1634, 8208, 9474 this is four digit of armstrong number
 * result - 1*1*1*1 = 6*6*6*6 + 3*3*3*3 + 4*4*4*4 */

