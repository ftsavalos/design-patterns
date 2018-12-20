package design.disambiguation;

import design.disambiguation.resolver.MyServiceFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class);
        MyController myController = context.getBean(MyController.class);
        myController.getServiceType();
    }

    @Bean
    public MyService getMyService() throws Exception {
        // some implementation resolving logic
        if (true) {
            return new MyServiceFactoryBean<>(MyServiceImplA.class).getObject();
        } else {
            return new MyServiceFactoryBean<>(MyServiceImplB.class).getObject();
        }
    }
}
