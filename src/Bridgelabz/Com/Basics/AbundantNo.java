package Bridgelabz.Com.Basics;

public class AbundantNo {
    public static void checkAbundantNumber(int number){
        int sum = 0;
        for (int i = 1; i<number; i++){
            if (number % i == 0)
                sum = sum+i;
        }
        if (sum>number){
            System.out.println("is an Abundant Number :"+number);
            System.out.println("The Abundance is :"+(sum-number));
        }else
            System.out.println("is not an Abundant Number :"+number);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Abundant Number program");
        checkAbundantNumber(12);

    }
}
