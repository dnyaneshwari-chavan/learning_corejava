class Account {
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into "
                + accountHolderName + "'s account. New balance: " + balance);
    }
}

class PremiumSavingAccount extends SavingAccount {
    double cashbackRate;

    void applyCashback() {
        double cashback = balance * cashbackRate / 100;
        balance += cashback;

        System.out.println("Cashback added: " + cashback
                + ". New balance: " + balance);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        PremiumSavingAccount obj = new PremiumSavingAccount();

        obj.accountHolderName = "Dnyaneshwari";
        obj.balance = 1000;
        obj.cashbackRate = 2;

        obj.deposit(1000);
        obj.applyCashback();
    }
}