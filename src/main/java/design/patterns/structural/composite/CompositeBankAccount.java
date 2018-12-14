package design.patterns.structural.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CompositeBankAccount implements Account {

    private List<Account> childAccounts = new ArrayList<>();

    @Override
    public void accountType() {
        childAccounts.forEach(Account::accountType);
    }

    public void add(Account account) {
        childAccounts.add(account);
    }

    public void remove(Account account) {
        childAccounts.remove(account);
    }
}
