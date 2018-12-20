package design.beanlifecycle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JdbcAccountRepository implements AccountRepository {

    @Override
    public void findByAccountId(Long accountId) {
        log.info("Account with Id: {}", accountId);
    }

    @Override
    public void populateCache() {
        log.info("Called populateCahe() method");
    }
}
