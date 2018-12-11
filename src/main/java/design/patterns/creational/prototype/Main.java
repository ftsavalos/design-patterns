package design.patterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Account currenAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
        currenAccount.accountType();

        Account otherCurreAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
        otherCurreAccount.accountType();

    }

}
