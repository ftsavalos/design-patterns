package design.patterns.creational.abstractfactory.model;

public class YesBank implements Bank {
    @Override
    public void bankName() {
        System.out.println("Yes Bank Pvt. Ltd.");
    }
}
