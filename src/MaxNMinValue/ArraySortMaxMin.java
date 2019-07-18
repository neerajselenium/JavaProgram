package MaxNMinValue;

import java.util.Arrays;

public class ArraySortMaxMin {
    public static void main(String[] args) {

        int[] arr = {10, 75, 12, 15, 20, 45, 5, 71, 79, 9};

        System.out.println( Arrays.toString( arr ) );

        Arrays.sort( arr );
        System.out.println( "Min value in  array is:" + arr[0] );
        System.out.println( "Max value in  array is:" + arr[arr.length - 1] );


    }
}
