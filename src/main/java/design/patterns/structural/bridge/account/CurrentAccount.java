package design.patterns.structural.bridge.account;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Primary
@Component
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
