package Bridgelabz.Com.Basics;

public class EvenOdd {
    static void checkEvenOrOdd(int Number) {
        if (Number % 2 == 0)
            System.out.println("NUmber is Even :" + Number);
        else
            System.out.println("Number is Odd : " + Number);
    }
    public static void main (String[]args){
        System.out.println("Checking whether the number is even or odd :");
        checkEvenOrOdd(19);

    }
}
