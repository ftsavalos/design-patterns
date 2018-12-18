package design.patterns.structural.facade;

import design.patterns.structural.decorator.Account;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankingServiceFacadeImpl implements BankingServiceFacade {

    @Override
    public void moneyTransfer() {
        if (PaymentService.doPayment()) {
            Account fromAccount = AccountService.getAccount("1");
            Account toAccount = AccountService.getAccount("2");
            TransferService.transfer(10000, fromAccount, toAccount);
        }
    }
}
