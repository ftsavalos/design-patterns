package design.beanlifecycle;

public interface AccountRepository {

    void findByAccountId(Long accountId);

    void populateCache();

}
