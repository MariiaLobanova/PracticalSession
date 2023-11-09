package org.example.Class911;

public class Main {
    public static void main(String[] args) {
        BankAccauntDefault customer = new BankAccauntDefault();

        Transactions depositTransaction = new DepositTransaction(customer, 200);
        Transactions withdrawTransaction = new WithdrawTransaction(customer, 150);
        Transactions placeholderdeposit = new PlaceholderTransaction(customer,1000);

        depositTransaction.execute();
        withdrawTransaction.execute();
        placeholderdeposit.execute();



        /*customer.deposit(200);
        customer.withdraw(150);
        customer.getBalance();

        customer.deposit(200);
        customer.withdraw(120);

        customer.getBalance();*/
    }
}
