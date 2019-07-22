package FirstInitials;

public class FirstInitialsExample {

    public static void main(String[] args) {
        String str = "Neeraj Kumar";
        initalExample( str );
    }

    private static void initalExample(String str) {

        String[] words = str.split( " " );
        for (String word : words) {
            System.out.print( Character.toUpperCase( word.charAt( 0 ) ) );

        }
    }


}
