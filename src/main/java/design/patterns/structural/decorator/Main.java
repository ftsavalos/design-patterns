package design.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Account basicSavingAccount = new SavingAccount();
        log.info(basicSavingAccount.getTotalBenefits());

        /*Account with decoration*/
        Privilege decoratedAccount = new Privilege(basicSavingAccount);
        log.info(decoratedAccount.applyOtherBenefits());

    }

}
