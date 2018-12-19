package design.disambiguation.resolver;

import design.disambiguation.MyService;
import org.springframework.beans.factory.FactoryBean;

public class MyServiceFactoryBean<T extends MyService> implements FactoryBean<MyService> {

    private Class<T> type;

    public MyServiceFactoryBean(Class<T> type) {
        this.type = type;
    }

    private T newInstance() throws IllegalAccessException, InstantiationException {
        return type.newInstance();
    }

    @Override
    public T getObject() throws Exception {
        return newInstance();
    }

    @Override
    public Class<T> getObjectType() {
        return type;
    }
}
