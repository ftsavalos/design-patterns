package design.patterns.structural.decorator;

public class CurrentAccount implements Account {

    @Override
    public String getTotalBenefits() {
        return "There is no withdrawal limit fot current account";
    }
}
