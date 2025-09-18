package singleton;

import singleton.lazy.LazyNotThreadSafeSingleton;

public class Main {


    public static void main(String[] args) {
        // Eager
        var eager = EagerSingleton.getInstance();
        var eager2 = EagerSingleton.getInstance();
        System.out.println("Confirmation eager: " + (eager == eager2));
        eager.getConfiguration();

        // Lazy Not Thread Safe
        var lazyNotThreadSafe = LazyNotThreadSafeSingleton.getInstance();
        var lazyNotThreadSafe2 = LazyNotThreadSafeSingleton.getInstance();
        System.out.println("Confirmation lazy not thread safe: " + (lazyNotThreadSafe == lazyNotThreadSafe2));


    }
}
