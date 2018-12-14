package design.patterns.structural.decorator;

public class SavingAccount implements Account {


    @Override
    public String getTotalBenefits() {
        return "SAVING ACCOUNT has 8% interest rate with per day $10000 withdrawal limit";
    }

}
