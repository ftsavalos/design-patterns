package design.patterns.structural.decorator;

public interface AccountBaseBenefits {

    default String getBenefits(Account account){
        return account.getTotalBenefits();
    }

}
