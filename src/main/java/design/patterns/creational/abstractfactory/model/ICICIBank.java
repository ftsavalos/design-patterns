package design.patterns.creational.abstractfactory.model;

public class ICICIBank implements Bank {

    @Override
    public void bankName() {
        System.out.println("ICICI Bank Ltd.");
    }
}
