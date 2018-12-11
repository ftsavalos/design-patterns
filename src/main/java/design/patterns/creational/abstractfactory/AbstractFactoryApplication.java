package design.patterns.creational.abstractfactory;

import design.patterns.creational.abstractfactory.model.Account;
import design.patterns.creational.abstractfactory.model.Bank;
import design.patterns.creational.abstractfactory.factory.AccountFactory;
import design.patterns.creational.abstractfactory.factory.BankFactory;
import design.patterns.creational.abstractfactory.factory.FactoryProducer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

    public static void main(String[] args) {
        AccountFactory accountFactory = FactoryProducer.getFactory("ACCOUNT");

        assert accountFactory != null;
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.getAccount();

        BankFactory bankFactory = new BankFactory();
        Bank yesBank = bankFactory.getBank("YES");
        yesBank.bankName();
    }
}
