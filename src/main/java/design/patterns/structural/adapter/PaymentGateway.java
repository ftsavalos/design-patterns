package design.patterns.structural.adapter;

import design.patterns.creational.prototype.Account;

public interface PaymentGateway {

    void doPayment(Account account1, Account account2);

}
