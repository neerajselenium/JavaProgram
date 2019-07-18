package BinarySearch;

import java.util.Scanner;


public class BinarySearchExample {
    public static void main(String[] args) {
        //used for sorted array

        int[] arr = {10, 25, 35, 45, 50, 60, 75, 90};

        Scanner scn = new Scanner( System.in );
        System.out.print( "enter value for search: " );
        int value = scn.nextInt();

        int len = arr.length;

        int beg = 0;
        int end = len - 1;
        int location = -1;
        location = binarySearch( arr, beg, end, value );


        if (location != -1)
            System.out.println( "the location of the item is " + location );
        else
            System.out.println( "Item not found" );
    }

    private static int binarySearch(int[] arr, int beg, int end, int value) {

        if (end >= beg) {
            int mid = (beg + end) / 2;
            if (arr[mid] == value) {
                return mid + 1;
            } else if (arr[mid] < value) {

                return binarySearch( arr, mid + 1, end, value );

            } else if (arr[mid] > value) {
                return binarySearch( arr, beg, mid - 1, value );
            }


        }
        return -1;
    }


}
