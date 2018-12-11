package design.patterns.creational.abstractfactory.factory;

import design.patterns.creational.abstractfactory.model.Account;
import design.patterns.creational.abstractfactory.model.Bank;

public  interface AbstractFactory {

    abstract Bank getBank(String bankName);

    public abstract Account getAccount(String accountType);

}
