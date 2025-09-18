package singleton;

import singleton.lazy.InitializationHolderSingleton;
import singleton.lazy.LazyNotThreadSafeSingleton;
import singleton.lazy.LazyThreadSafeButCleanOneSingleton;

public class Main {


    public static void main(String[] args) {
        // Eager
        var eager = EagerSingleton.getInstance();
        var eager2 = EagerSingleton.getInstance();
        System.out.println("Confirmation eager: " + (eager == eager2));

        // Lazy Not Thread Safe
        var lazyNotThreadSafe = LazyNotThreadSafeSingleton.getInstance();
        var lazyNotThreadSafe2 = LazyNotThreadSafeSingleton.getInstance();
        System.out.println("Confirmation lazy not thread safe: " + (lazyNotThreadSafe == lazyNotThreadSafe2));

        // Lazy Thread Safe
        var lazyThreadSafe = LazyThreadSafeButCleanOneSingleton.getInstance();
        var lazyThreadSafe2 = LazyThreadSafeButCleanOneSingleton.getInstance();
        System.out.println(lazyThreadSafe == lazyThreadSafe2);

        // Initialization Holder
        var initializationHolder = InitializationHolderSingleton.getInstance();
        var initializationHolder2 = InitializationHolderSingleton.getInstance();
        System.out.println(initializationHolder == initializationHolder2);


    }
}
