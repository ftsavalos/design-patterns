package design.patterns.structural.proxy;

import design.patterns.structural.composite.Account;
import design.patterns.structural.composite.SavingAccount;

public class ProxySavingAccount implements Account {

    private Account savingAccount;

    public ProxySavingAccount() {
    }

    @Override
    public void accountType() {
        if (savingAccount == null) {
            savingAccount = new SavingAccount();
            savingAccount.accountType();
        }
    }
}
