package Bridgelabz.Com.Basics;

public class PerFactNumber {
    public static void checkPerFactNumber(int number){
        int sum = 0;
        for (int i =1; i<number; i++){
            if (number%i == 0){
                sum = sum+i;
            }
        }
        if (number == sum)
            System.out.println("Number is perfect:"+sum);
        else
            System.out.println("Number is Not perfect:"+sum);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Perfect Number program:");
        checkPerFactNumber(6);
    }
}
// 6 ------> 1+ 2 +3=6
