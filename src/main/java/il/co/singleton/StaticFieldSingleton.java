package il.co.singleton;

//Thread safe implementation.

public class StaticFieldSingleton {
    public static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();
}
