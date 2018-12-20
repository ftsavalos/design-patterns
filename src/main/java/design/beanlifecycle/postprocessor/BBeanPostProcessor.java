package design.beanlifecycle.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BBeanPostProcessor implements BeanPostProcessor, Ordered {

    private static int count = 0;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        count++;
        log.info("{} - [Before] - Bean name is: {}", count, beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("{} - [After ] - Bean name is: {}", count, beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
