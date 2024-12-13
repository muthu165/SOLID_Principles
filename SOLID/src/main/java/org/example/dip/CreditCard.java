package org.example.dip;

public class CreditCard implements BankCard{
    public void doTransaction(long amount){
        System.out.println("Payment through Credit Card");
    }
}
