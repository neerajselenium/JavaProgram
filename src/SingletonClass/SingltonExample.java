package SingletonClass;

public class SingltonExample {

    private static SingltonExample instance;

    private SingltonExample() {
    }

    public static SingltonExample getInstance() {
        if (instance == null) {
            instance = new SingltonExample();
        }

        return instance;
    }


    void display() {
        System.out.println( "Singletoin class program" );
    }
}
