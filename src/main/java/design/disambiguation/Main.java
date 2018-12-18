package design.disambiguation;

import design.disambiguation.resolver.MyServiceFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class);
        MyService myService = (MyService) context.getBean("getMyService");

        myService.getServiceType();
    }

    @Bean
    public <T extends MyService> T getMyService() throws Exception {
        // some implementation resolving logic
        if (false) {
            return (T) new MyServiceFactoryBean<>(MyServiceImplA.class).getObject();
        } else {
            return (T) new MyServiceFactoryBean<>(MyServiceImplB.class).getObject();
        }
    }


//    @Bean
//    public <T extends MyService> T getMyService() throws Exception {
//        // some implementation resolving logic
//        if (false) {
//            MyServiceImplA myServiceImplA = new MyServiceFactoryBean<MyServiceImplA>().getObject();
//            return (T) myServiceImplA;
//        } else {
//            return (T) new MyServiceFactoryBean<MyServiceImplB>().getObjectType();
//        }
//    }
}
