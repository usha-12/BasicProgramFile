package Bridgelabz.Com.Day1practice;

public class SumOfNumberCommandLine {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;
        System.out.println("sum of x and y:"+sum);

    }
}

