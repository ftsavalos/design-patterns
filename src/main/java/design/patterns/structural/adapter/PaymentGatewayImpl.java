package design.patterns.structural.adapter;

import design.patterns.creational.prototype.Account;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayImpl implements PaymentGateway {

    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("Do payment using Payment Gateway");
    }
}
