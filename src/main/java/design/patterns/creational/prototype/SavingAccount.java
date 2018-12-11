package design.patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SavingAccount extends Account {
    @Override
    public void accountType() {
        log.info("SAVING ACCOUNT");
    }
}
