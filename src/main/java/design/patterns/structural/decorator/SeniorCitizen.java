package design.patterns.structural.decorator;

public class SeniorCitizen extends AccountDecorator {

    SeniorCitizen(Account account) {
        super(account);
    }

    @Override
    String applyOtherBenefits() {
        return "nothing more";
    }
}
