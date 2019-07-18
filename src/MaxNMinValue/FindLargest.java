package MaxNMinValue;

public class FindLargest {
    public static void main(String[] args) {

        int[] arr = {10, 75, 12, 15, 20, 45, 5, 71, 79, 9};

        int len = arr.length;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println( "minimum value is: " + min );
        System.out.println( "maximum value is: " + max );
    }
}
