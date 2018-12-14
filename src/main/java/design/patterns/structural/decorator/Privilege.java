package design.patterns.structural.decorator;

public class Privilege extends AccountDecorator {

    Privilege(Account account) {
        super(account);
    }

    @Override
    String applyOtherBenefits() {
        return "a medical insurance up to $1,000 for Priviledge";
    }
}
