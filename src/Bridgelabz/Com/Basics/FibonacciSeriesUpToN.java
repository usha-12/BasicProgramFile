package Bridgelabz.Com.Basics;

public class FibonacciSeriesUpToN {
    public static void checkFibonacciSeries(int number){
        int firstNo = 0;
        int secondNo = 1;
        for (int i =1; i<=number; i++){
            System.out.println(firstNo);
            int last2NoStore = firstNo+secondNo;//1-2
            firstNo = secondNo;//assign the value secondNo to firstNo
            secondNo = last2NoStore;
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Fibonacci Series program");
        checkFibonacciSeries(7);

    }
}
//0 1 1 2 3 5 8 13
//0+1=1
//1+1=2
//1+2=3
//2+3=5F
//3+5=8
//8+5=13

