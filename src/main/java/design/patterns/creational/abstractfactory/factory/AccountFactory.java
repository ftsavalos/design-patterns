package design.patterns.creational.abstractfactory.factory;

import design.patterns.creational.abstractfactory.model.Account;
import design.patterns.creational.abstractfactory.model.Bank;
import design.patterns.creational.abstractfactory.model.CurrentAccount;
import design.patterns.creational.abstractfactory.model.SavingAccount;

import static java.util.Objects.isNull;

public class AccountFactory implements AbstractFactory {

    private final String CURRENT_ACCOUNT = "CURRENT";
    private final String SAVING_ACCOUNT = "SAVING";

    @Override
    public Bank getBank(String bankName) {
        throw new RuntimeException("Account Factory can only create Accounts...");
    }

    @Override
    public Account getAccount(String accountType) {
        if (isNull(accountType)) {
            throw new RuntimeException("accountType is not specified");
        }
        switch (accountType) {
            case CURRENT_ACCOUNT:
                return new CurrentAccount();
            case SAVING_ACCOUNT:
                return new SavingAccount();
            default:
                throw new RuntimeException("There is no factory of type: " + accountType);
        }
    }
}
