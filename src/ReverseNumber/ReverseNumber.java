package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn= new Scanner( System.in );
        System.out.println("enter number");
        int originalNum= scn.nextInt();
        System.out.println( "Orignal number is : "+ originalNum );

        int reveseNum=0;
        while(originalNum!=0)
        {
            reveseNum=reveseNum*10;
            reveseNum=reveseNum+originalNum%10;
            originalNum=originalNum/10;
        }
        System.out.print("Reverse Number is: "+ reveseNum);
    }
}
