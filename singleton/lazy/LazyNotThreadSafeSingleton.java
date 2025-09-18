package singleton.lazy;

public class LazyNotThreadSafeSingleton {
    private static LazyNotThreadSafeSingleton INSTANCE;

    private LazyNotThreadSafeSingleton() {

    }

    public static LazyNotThreadSafeSingleton getInstance() {
        if(INSTANCE == null)
            INSTANCE = new LazyNotThreadSafeSingleton();
        return INSTANCE;
    }

    public void getConfiguration(){
        System.out.println("Loading configuration...");
    }
}