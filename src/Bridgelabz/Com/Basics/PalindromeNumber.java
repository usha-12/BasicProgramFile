package Bridgelabz.Com.Basics;

public class PalindromeNumber {
    public static void checkNumberPalindrome(int number){
        int reverse = 0;
        int original = 0;
        original=number;
        while (number>0){
            reverse = reverse*10+number%10;
            number = number/10;
            System.out.println("Reverse NUmber:"+reverse);
        }
        if (original==reverse)
            System.out.println("Number is Palindrome :"+original);
        else
            System.out.println("Number is not Palindrome : "+original);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Number program...");
        checkNumberPalindrome(101);

    }
}
//as the original and the reversed are the same,the string is a palindrome.

