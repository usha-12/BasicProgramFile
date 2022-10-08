package Bridgelabz.Com.ArrayBasic;

import java.util.Scanner;

public class SmallestElementArray {
    public static void checkSmallestElement(){
        int []array= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element of Array");
        for (int i = 0; i<5; i++){
            array[i]=sc.nextInt();
        }
        int mini = array[0];
        for (int i = 1; i<4; i++) {
            if (array[i] < mini) {
                mini = array[i];
            }
        }
        System.out.println("Smallest Element in Array :"+mini);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the  smallest element in array program");
        checkSmallestElement();
    }
}
//Java Program to print the smallest element in an array
