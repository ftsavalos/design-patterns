package design.patterns.structural.bridge;

import design.patterns.structural.bridge.account.Account;
import design.patterns.structural.bridge.account.CurrentAccount;
import design.patterns.structural.bridge.bank.Bank;
import design.patterns.structural.bridge.bank.IciciBank;

public class Main {

    public static void main(String[] args) {

        Bank bank = new IciciBank(new CurrentAccount());

        Account account = bank.openAccount();
        account.accountType();
    }
}
