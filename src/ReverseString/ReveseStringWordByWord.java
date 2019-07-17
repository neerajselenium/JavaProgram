package ReverseString;

public class ReveseStringWordByWord {
    public static void main(String[] args) {

        String str = "Welcome to program";
        System.out.println( "Before Reverse: " + str );
        String[] words = str.split( " " );

        String revString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt( j );
            }
            revString = revString + revWord + " ";
        }

        System.out.println( "reverse string is: " + revString );
    }
}