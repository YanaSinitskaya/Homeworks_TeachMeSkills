package Homework6;

public class Program {
    public static void main(String[] args) {
        CreditCard Account1 = new CreditCard();
        Account1.AccountNumber = "BY20OLMP31350000001000000933";
        Account1.AmountOnAccount = 10;
        CreditCard Account2 = new CreditCard();
        Account2.AccountNumber = "BY100LMP31650000001034970980";
        Account2.AmountOnAccount = 15;
        CreditCard Account3 = new CreditCard();
        Account3.AccountNumber = "BY15OLMP31480012001000519922";
        Account3.AmountOnAccount = 20;
        Account1.AddMoney(615);
        Account2.AddMoney(145);
        Account3.WithDrawMoney(17);
        Account1.CreditCardInfo();
        Account2.CreditCardInfo();
        Account3.CreditCardInfo();
    }
}