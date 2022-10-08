package Bridgelabz.Com.ArrayBasic;

import java.util.Scanner;

public class ArrayInReverseOrder {
    public static void checkArrayInreverseOrder(){
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array");
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("array Element:");
        for (int i = 0; i<array.length; i++){
            System.out.println(" "+array[i]);
        }
        System.out.println("\nReverse Array Elements :");
        for (int i = array.length-1; i>=0; i--){
            System.out.println(" "+array[i]);
        }

    }
    public static void main(String[] args) {
        System.out.println("welcome to the  array in reverse order program");
        checkArrayInreverseOrder();
    }
}

