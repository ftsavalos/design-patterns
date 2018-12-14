package design.patterns.structural.facade;

import design.patterns.structural.decorator.Account;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransferService {

    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        log.info("Transferring money");
    }

}
