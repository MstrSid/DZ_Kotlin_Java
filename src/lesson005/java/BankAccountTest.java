package lesson005.java;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Mike";
        myAccount.balance = 1500.12;

        myAccount.cashIn(150.55);
        myAccount.cashOut(1500);
        myAccount.cashOut(5000);
    }
}

class BankAccount{
    int id = 0;
    String name = "NoName";
    double balance = 0.0;

    public void cashIn(double cashSum){
        if(cashSum>=0.0) {
            balance += cashSum;
            System.out.println("Cash in successful. Now is "+String.format("%.2f", balance));
        } else System.out.println("Incorrect cash value.");
    }

    public void cashOut(double cashSum){
        if(cashSum<=balance){
            balance-=cashSum;
            System.out.println("Cash out successful. Now is "+String.format("%.2f", balance));
        } else System.out.println("You enter sum more than you balance. Now is "+String.format("%.2f", balance));
    }
}
