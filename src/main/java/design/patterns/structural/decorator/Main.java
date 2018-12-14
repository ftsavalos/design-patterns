package design.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Account account = new SavingAccount();
        log.info(account.getTotalBenefits());

        Privilege decoratedAccount = new Privilege(account);
        log.info(decoratedAccount.getTotalBenefits());

        AccountDecorator accountDecorator = new AccountDecorator(account) {
            @Override
            String applyOtherBenefits() {
                return "nothing to Add";
            }
        };

        log.info(accountDecorator.getTotalBenefits());



    }

}
