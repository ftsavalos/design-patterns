package design.patterns.structural.bridge;

import design.patterns.structural.bridge.account.Account;
import design.patterns.structural.bridge.bank.Bank;
import design.patterns.structural.bridge.bank.IciciBank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class);
        Bank bank = context.getBean(IciciBank.class);

        Account account = bank.openAccount();
        account.accountType();
    }
}
