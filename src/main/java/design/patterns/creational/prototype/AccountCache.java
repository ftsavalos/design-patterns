package design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {

    public static Map<String, Account> accountCacheMap = new HashMap<>();

    static {
        accountCacheMap.put("SAVING", new SavingAccount());
        accountCacheMap.put("CURRENT", new CurrentAccount());
    }

}
