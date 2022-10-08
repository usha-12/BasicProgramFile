package Bridgelabz.Com.Basics;

public class LeapYear {
    public static void checkLeapYearOrNot(int year){
        if (year % 400==0)
            System.out.println("Year is a Leap year:"+year);
        else if (year % 4==0 && year % 100 != 0)
            System.out.println("Year is a Leap Year:"+year);
        else
            System.out.println("Year is not Leap Year:"+year);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Leap year Program :");
        System.out.println("Enter the Year:");
        checkLeapYearOrNot(2020);
    }
}
//The year must be divisible by 400
//The year must be divisible by 4 but not divisible by 100.

