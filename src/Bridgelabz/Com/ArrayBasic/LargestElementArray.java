package Bridgelabz.Com.ArrayBasic;

import java.util.Scanner;

public class LargestElementArray {
    public static void checkLargestElement() {
        int array[] = new int[5];//10 20 50 40 30
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        max = array[0];
        for (int i = 1; i < 4; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum Element :" + max);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the  largest element in an array");
        checkLargestElement();
    }
}
//Java Program to print the largest element in an array
