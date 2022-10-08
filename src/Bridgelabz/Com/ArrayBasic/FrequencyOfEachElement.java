package Bridgelabz.Com.ArrayBasic;

import java.util.Scanner;

public class FrequencyOfEachElement {
    public static void checkFrequencyOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int array = sc.nextInt();
        System.out.println("Enter Array Element:");
        int array1[] = new int[array];
        int array2[] = new int[array];
        int count = 0;
        for (int i = 0; i<array; i++){//user input the number from array1
            array1[i] = sc.nextInt();
        }
        //array1=1 2 3 4 -1
        //array2=2
        for (int i = 0; i<array; i++){//0,
            count = 1;
            if (array1[i]!=-1){// array[0]!=-1
                for (int j = i+1; j<array; j++){//1,j=2<5,3,4
                    if (array1[i]==array1[j]){//array[0]==array[4]
                        count = count + 1;//2
                        array1[j] = -1;//array[4]==-1
                    }
                }
                array2[i]=count;//array2[0]=2
            }
        }
        for (int i =0; i<array; i++){//0,1,2,3,4
            if (array1[i]!=-1){//a[4]!=-1
                // System.out.println("Print frequency of each element in an array:");
                System.out.println(array1[i]+":"+array2[i]);
                //1:2
                //2:1
                //3:1
                //4:1

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the frequency of each element");
        checkFrequencyOfArray();
    }
}

