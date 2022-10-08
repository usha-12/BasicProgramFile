package Bridgelabz.Com.Day1practice;

public class StringEqualOrNot {
    public static void checkStringEqualOrNot(String s1, String s2){
        if (s1.equals(s2)){
            System.out.println("String Equal");
        }else {
            System.out.println("String Not Equal");
        }
    }
    public static void main(String[] args) {
        System.out.println("check two strings are equal or not");
        checkStringEqualOrNot("sachin","Sachin");
    }
}

