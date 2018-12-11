package design.patterns.creational.abstractfactory.model;

public class CurrentAccount implements Account {
    @Override
    public void getAccount() {
        System.out.println("This is CurrentAccount");
    }
}
