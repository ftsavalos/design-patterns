package design.patterns.structural.bridge.bank;

import design.patterns.structural.bridge.account.Account;

public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract Account openAccount();

}
