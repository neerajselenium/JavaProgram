package ReverseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseStringB2B {

    public static void main(String[] args) throws IOException {
        System.out.println("enter string: ");
        BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
        String orignalString= scn.readLine();
        System.out.println("Original String is: "+ orignalString);
        String reverseString="";
        int len=orignalString.length();
        for(int i=len-1;i>=0;i--)
        {
            reverseString= reverseString+orignalString.charAt( i );
        }
        System.out.println("Reverse String is: "+ reverseString);

    }
}
