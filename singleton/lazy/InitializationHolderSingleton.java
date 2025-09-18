package singleton.lazy;

public class InitializationHolderSingleton {

    private InitializationHolderSingleton() {

    }

    private static class InitializeHolder {
        private final static InitializationHolderSingleton INSTANCE = new InitializationHolderSingleton();
    }

    public static InitializationHolderSingleton getInstance() {
        return InitializeHolder.INSTANCE;
    }

    public void getConfiguration() {
        System.out.println("Loading configuration...");
    }
}
