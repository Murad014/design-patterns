package singleton;

public class EagerSingleton {
    private final static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void getConfiguration(){
        System.out.println("Loading configuration...");
    }


}
