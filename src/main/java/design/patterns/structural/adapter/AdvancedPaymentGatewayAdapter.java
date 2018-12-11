package design.patterns.structural.adapter;

import design.patterns.creational.prototype.Account;
import org.springframework.stereotype.Service;

@Service
public class AdvancedPaymentGatewayAdapter implements AdvancedPaymentGateway {

    private final PaymentGateway paymentGateway;

    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String mobile1, String mobile2) {
        Account account1 = null;
        Account account2 = null;
        paymentGateway.doPayment(account1, account2);
    }
}
