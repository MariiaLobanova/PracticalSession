package org.example.Class911;

public class BankAccauntDefault implements BankAccount{

    private double balance = 0;
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance -=amount;
            System.out.println("-"+amount);
        } else{
            System.out.println("you dont have enough money");
        }
    }

    @Override
    public double getBalance() {
        System.out.println("Balance is " + balance);
        return balance;
    }

    @Override
    public void placeholderdeposit(double amount) {
        System.out.println("Placeholder transaction");
    }
}
