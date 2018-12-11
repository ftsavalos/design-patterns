package design.patterns.creational.abstractfactory.model;

public class SavingAccount implements Account {

    @Override
    public void getAccount() {
        System.out.println("This is a SavingAccount");
    }
}
