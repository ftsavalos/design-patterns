package design.patterns.structural.decorator;

public class Privilege extends AccountDecorator {

    Privilege(Account account) {
        super(account);
    }

    @Override
    public String applyOtherBenefits() {
        return super.getTotalBenefits() + " an accident insurance of up to $1,600 and an overdraft facility of $84";
    }
}
