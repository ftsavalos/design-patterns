package design.patterns.structural.bridge.account;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        log.info("OPENED: SAVING ACCOUNT ");
        return new SavingAccount();
    }

    @Override
    public void accountType() {
        log.info("##It is a SAVING ACCOUNT##");
    }
}
