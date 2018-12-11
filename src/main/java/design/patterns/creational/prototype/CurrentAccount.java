package design.patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentAccount extends Account {

    @Override
    public void accountType() {
        log.info("CURRENT ACCOUNT: " + this.hashCode());
    }
}
