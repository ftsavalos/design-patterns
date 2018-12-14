package design.patterns.structural.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SavingAccount implements Account {
    @Override
    public void accountType() {
        log.info("SAVING ACCOUNT");
    }
}
