package design.patterns.creational.abstractfactory.factory;

import design.patterns.creational.abstractfactory.model.Account;
import design.patterns.creational.abstractfactory.model.Bank;
import design.patterns.creational.abstractfactory.model.ICICIBank;
import design.patterns.creational.abstractfactory.model.YesBank;

public class BankFactory implements AbstractFactory {

    final String ICICI_BANK = "ICICI";
    final String YES_BANK = "YES";

    @Override
    public Bank getBank(String bankName) {

        if (ICICI_BANK.equalsIgnoreCase(bankName)){
            return new ICICIBank();
        } else if (YES_BANK.equalsIgnoreCase(bankName)) {
            return new YesBank();
        }

        return null;
    }

    @Override
    public Account getAccount(String accountType) {
        return null;
    }
}
