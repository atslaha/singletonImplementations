package il.co.singleton;

//Lazy initialisation, high performance.

public class DoubleCheckedLockingVolatileSingleton {
    private static volatile DoubleCheckedLockingVolatileSingleton instance;

    public static DoubleCheckedLockingVolatileSingleton getInstance() {
        DoubleCheckedLockingVolatileSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingVolatileSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedLockingVolatileSingleton();
                }
            }
        }
        return localInstance;
    }
}
