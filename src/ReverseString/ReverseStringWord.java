package ReverseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ReverseStringWord {

    public static void main(String[] args) throws IOException {
        System.out.println( "enter string: " );
        BufferedReader scn = new BufferedReader( new InputStreamReader( System.in ) );
        String orignalString = scn.readLine();
        System.out.println("Original String is: "+ orignalString);
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(orignalString);
        String reversetString = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                reversetString = temp[i] + reversetString;
            else
                reversetString = " " + temp[i] + reversetString;
        }

        System.out.print("Reverse String is: "+ reversetString);




    }
}
