package Bridgelabz.Com.Basics;

public class AutomorphicNo {
    static int isAutomorphic(int number){
        int square = number * number;
        while (number != 0){
            if (number%10 != square % 10){
                return 0;
            }
            number = number / 10;
            square = square / 10;
        }
        return 1;
    }
    public static void main(String[] args) {
        int number = 376;
        int square = number*number;
        if (isAutomorphic(number) == 1){
            System.out.println("Number :" +number+", square:" +square+" = is Automorphic ");
        }else {
            System.out.println("Number :"+number+", square:" +square+" = is not Automorphic");
        }

    }
}
