package Bridgelabz.Com.Basics;

public class PerfectSquare {
    static boolean isPerfectSquare(int number){
        if (number >= 0){
            int square = (int)Math.sqrt(number);
            return ((square*square) == number);
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 20;
        if (isPerfectSquare(number))
            System.out.println("True");
        else
            System.out.println("False");

    }
}

