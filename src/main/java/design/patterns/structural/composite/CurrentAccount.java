package design.patterns.structural.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        log.info("CURRENT ACCOUNT");
    }
}