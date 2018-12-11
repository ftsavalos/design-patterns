package design.patterns.creational.singleton;

public class EarlySingletonClass implements Cloneable {

    private static final EarlySingletonClass INSTANCE = new EarlySingletonClass();

    private EarlySingletonClass() {}

    public static EarlySingletonClass getInstance() {
        return INSTANCE;
    }

}
