package design.patterns.structural.decorator;

public class SeniorCitizen extends AccountDecorator {

    public SeniorCitizen(Account account) {
        super(account);
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are " + applyOtherBenefits();
    }

    @Override
    public String applyOtherBenefits() {
        return " an medical insurance of up to $1,000 for Senior Citizen";
    }
}
