package il.co.singleton;

//Lazy initialisation, thread safe.

public class SynchronizedAccessorSingleton {
    private static SynchronizedAccessorSingleton instanse;

    public static synchronized SynchronizedAccessorSingleton getInstanse(){
        if (instanse == null) {
            instanse = new SynchronizedAccessorSingleton();
        }
        return instanse;
    }
}
