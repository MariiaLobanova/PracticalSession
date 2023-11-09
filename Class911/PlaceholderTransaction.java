package org.example.Class911;

public class PlaceholderTransaction implements Transactions {
    private  BankAccount account;
    private double amount;

    public PlaceholderTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.placeholderdeposit(amount);
    }
}
