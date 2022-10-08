package Bridgelabz.Com.ArrayBasic;

import java.util.Scanner;

public class ArrayAscendingOrder {
    public static void printAscendingOrder(){
        int array[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements :");
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        for (int i =0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]>array[j]){
                    int storeElement = array[i];
                    array[i] = array[j];
                    array[j] = storeElement;
                }
            }
        }
        System.out.println("print Ascending Order Elements in Array :");
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the  array in ascending order program");
        printAscendingOrder();
    }
}

