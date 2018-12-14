package design.patterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        SavingAccount savingAccount1 = new SavingAccount();
        SavingAccount savingAccount2 = new SavingAccount();

        CurrentAccount currentAccount1 = new CurrentAccount();
        CurrentAccount currentAccount2 = new CurrentAccount();

        CompositeBankAccount compositeBankAccount1 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount2 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount = new CompositeBankAccount();

        /*Composing the Bank Account*/
        compositeBankAccount1.add(savingAccount1);
        compositeBankAccount1.add(currentAccount1);
        compositeBankAccount2.add(savingAccount2);
        compositeBankAccount2.add(currentAccount2);

        compositeBankAccount.add(compositeBankAccount1);
        compositeBankAccount.add(compositeBankAccount2);
        compositeBankAccount.accountType();

    }
}
