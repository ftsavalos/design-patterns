package design.patterns.structural.bridge.account;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentAccount implements Account {
    @Override
    public Account openAccount() {
        log.info("OPENED: CURRENT ACCOUNT ");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        log.info("##It is a CURRENT ACCOUNT##");
    }
}
