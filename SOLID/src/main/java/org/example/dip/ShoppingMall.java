package org.example.dip;

public class ShoppingMall {
//    Tightly coupled shoppingmall->debitcard;
    public BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchase(long amount) {
        bankCard.doTransaction(amount);
    }


    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchase(1000);
    }
}
