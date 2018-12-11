package design.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonApplication {
    public static void main(String[] args) {
        EarlySingletonClass a = EarlySingletonClass.getInstance();

        EarlySingletonClass b = EarlySingletonClass.getInstance();

        log.info(a.hashCode() + "");
        log.info(b.hashCode() + "");
    }
}
