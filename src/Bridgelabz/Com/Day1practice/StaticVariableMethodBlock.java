package Bridgelabz.Com.Day1practice;

public class StaticVariableMethodBlock {
    static  int num1 = 10;
    static int num2;
    static void function(int num3, int num4){
        int sum= num3 + num4;
        System.out.println("sum is = "+sum);
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
    static {
        System.out.println("Static block");
        num2 = num1 + 5;
    }
    public static void main(String[] args) {
        System.out.println(" demonstrate static variables, methods, and blocks.");
        function(20,30);
    }
}

