package Bridgelabz.Com.Basics;

public class NumberPositiveNegative {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        NumberPositiveOrNegative(20);
    }
    static void NumberPositiveOrNegative(int num) {
        if (num > 0)
            System.out.println("Number is Positive : "+num);
        else if (num < 0)
            System.out.println("Number is negative : "+num);
        else
            System.out.println("Number is Zero : "+num);
    }
}

