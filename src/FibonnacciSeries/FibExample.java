package FibonnacciSeries;

import java.util.Scanner;

public class FibExample {

    public static void main(String[] args) {

        System.out.print("enter number: ");
        Scanner scn= new Scanner(System.in);
        int num=scn.nextInt();
        int a=1, b=1,c;
        System.out.print(a +  ", " + b +", ");
        for(int i=1;i<=num;i++)
        {
            c=a+b;
            a=b;
            b=c;

            System.out.print(c +", ");


        }

    }
}
