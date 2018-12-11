package design.patterns.structural.bridge.bank;

import design.patterns.structural.bridge.account.Account;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IciciBank extends Bank {

    public IciciBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        log.info("Open your account with ICICI Bank");
        return account;
    }
}
