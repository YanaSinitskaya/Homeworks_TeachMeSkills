package Homework6;

public class CreditCard {
    String AccountNumber;
    int AmountOnAccount;
    void AddMoney(int MoneyToAdd) {
        AmountOnAccount += MoneyToAdd;
    }
    void WithDrawMoney(int MoneyToWithdraw) {
        AmountOnAccount -= MoneyToWithdraw;
    }
    void CreditCardInfo (){
        System.out.println("Your account"+ " " +AccountNumber + " " + "The current amount on the account" + " " +AmountOnAccount);
    }
}
