package design.patterns.structural.facade;

import design.patterns.structural.decorator.Account;
import design.patterns.structural.decorator.SavingAccount;

public class AccountService {

    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }

}
