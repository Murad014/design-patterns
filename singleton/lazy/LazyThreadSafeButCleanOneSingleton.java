package singleton.lazy;

public class LazyThreadSafeButCleanOneSingleton {
    private volatile static LazyThreadSafeButCleanOneSingleton INSTANCE;

    private LazyThreadSafeButCleanOneSingleton() {
    }

    public static LazyThreadSafeButCleanOneSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyThreadSafeButCleanOneSingleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new LazyThreadSafeButCleanOneSingleton();
            }
        }
        return INSTANCE;
    }

    public void getConfiguration() {
        System.out.println("Get Configuration...");
    }
}
