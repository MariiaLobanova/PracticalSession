package org.example.Class611Treads;

import java.util.concurrent.ExecutorService;

// Create a Customer class that implements Runnable and simulates a
//customer performing a deposit.
// Instantiate and start multiple Customer threads using both the
//Thread class and Runnable interface. Observe the concurrent
//execution.
public class Customer implements Runnable {
    private BankAccount account;
    private double depositAmount;
    private double withdrawAmount;

    public Customer(BankAccount account, double depositAmount, double withdrawAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        if (depositAmount > 0) {
            System.out.println("deposit of $" + depositAmount);
            account.deposit(depositAmount);
            System.out.println("Balance is " + account.getBalance());
        }

        if (withdrawAmount > 0) {
            System.out.println("withdraw of $" + withdrawAmount);
            account.withdraw(withdrawAmount);
            System.out.println("Balance is " + account.getBalance());
        }
    }
}

class BankAccount {
    private double balance = 0.0;

    public synchronized void deposit(double amount) {
        balance += amount;
       // System.out.println("After making deposite . Balance is " + balance);
        System.out.println("++++++++++");
    }
    public synchronized void withdraw(double amount) {
        if(amount<=balance){
            balance -= amount;
       // System.out.println("After withdraw . Balance is " + balance);
        System.out.println("++++++++++");
        }else{
            System.out.println("you have not enough money on your account");
        }
    }

    public BankAccount(double initialBalance, int balance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        int initialBalance = 550;

        BankAccount bankAccount = new BankAccount(500, initialBalance); // instance of main thread

        System.out.println("Balance from the beginning is " + bankAccount.getBalance());
        System.out.println("++++++++++");

        Customer customer = new Customer(bankAccount, 200.0,0);// creating new threads

        Thread customerDeposit1 = new Thread(new Customer(bankAccount,200.0,0));
        Thread customerDeposit2 = new Thread(new Customer(bankAccount,300.0,0));

        Thread customerWithdraw1 = new Thread(new Customer(bankAccount,0.0,300));
        Thread customerWithdraw2 = new Thread(new Customer(bankAccount,0.0,200));

        Thread.sleep(2000);
        customerDeposit1.start();
        System.out.println(customerDeposit1);
        System.out.println("++++++++++");

        Thread.sleep(2000);
        customerDeposit2.start();
        System.out.println(customerDeposit2);
        System.out.println("++++++++++");

        Thread.sleep(2000);
        customerWithdraw1.start();
        System.out.println(customerWithdraw1);
        System.out.println("++++++++++");

        Thread.sleep(2000);
        customerWithdraw2.start();
        System.out.println(customerWithdraw2);
        System.out.println("++++++++++");



        System.out.println("Final balance: $" + bankAccount.getBalance());
    }
}
