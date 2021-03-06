package design.beanlifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class);
        AccountRepository accountRepository = context.getBean(AccountRepository.class);
        accountRepository.findByAccountId(2L);
    }

    @Bean(initMethod = "populateCache")
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository();
    }
}
