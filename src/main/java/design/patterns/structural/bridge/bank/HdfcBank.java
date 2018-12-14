package design.patterns.structural.bridge.bank;

import design.patterns.structural.bridge.account.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HdfcBank extends Bank {

    public HdfcBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        log.info("Open your account with HDFC Bank");
        return account;
    }
}
