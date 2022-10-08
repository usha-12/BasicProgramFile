package Bridgelabz.Com.ArrayBasic;

import java.util.Scanner;

public class DuplicateElements {
    public static void checkDuplicateElements(){
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of array");
        for (int i = 0; i <array.length; i++){
            array[i]= sc.nextInt();
        }
        for (int i = 0; i<array.length-1; i++){
            for (int j = i+1; j<array.length; j++){
                if (array[i]==array[j]){
                    System.out.println("Duplicate Elements are:"+array[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the duplicate elements in array program");
        checkDuplicateElements();

    }
}

