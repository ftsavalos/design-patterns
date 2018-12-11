package design.patterns.creational.singleton;

public class LazySingletonClass {

    private static LazySingletonClass instance = null;

    private LazySingletonClass() {}

    private LazySingletonClass getInstance() {
        if (instance == null) {
            synchronized (LazySingletonClass.class) {
                if (instance == null) {
                    return new LazySingletonClass();
                }
            }
        }
        return instance;
    }

}
