package LinearSearch;

import java.util.Scanner;

public class LinearSearchExample {


    //Search value in unsorted array

    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 20, 45, 71, 99};
        Scanner scn = new Scanner( System.in );
        int num = scn.nextInt();

        boolean search = binarySearch( arr, num );
        if (search) {
            System.out.println( " found value in" + num );
        } else {
            System.out.println( "not found" );
        }
    }

    private static boolean binarySearch(int[] arr, int num) {

        int len = arr.length;
        for (int i = 0; i <= len - 1; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;

    }

}
