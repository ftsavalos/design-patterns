package design.patterns.creational.abstractfactory.factory;

public class FactoryProducer {
    private final static String BANK = "BANK";
    private final static String ACCOUNT = "ACCOUNT";

    public static <T extends AbstractFactory> T getFactory(String factory) {

        if (BANK.equalsIgnoreCase(factory)) {
            return (T) new BankFactory();
        } else if (ACCOUNT.equalsIgnoreCase(factory)) {
            return (T) new AccountFactory();
        }

        return null;
    }
}
