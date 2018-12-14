package design.patterns.structural.decorator;

public abstract class AccountDecorator implements Account {

    Account account;

    AccountDecorator(Account account) {
        this.account = account;
    }

    abstract String applyOtherBenefits();

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are " + this.applyOtherBenefits();
    }
}
