class Account {
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into "
                + accountHolderName + "'s account. New balance: " + balance);
    }
}

class SavingAccount extends Account {
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest
                + ". New balance: " + balance);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    void withdraw(double amount) {
        if(amount <= overdraftLimit + balance){
                  balance -= amount;
        System.out.println(accountHolderName + "account. New balance is" + balance);
    } else {
        System.out.println("Overdraft limit exceed!!");
    }
}
}
public class Hierarchical {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount();
        saving.accountHolderName = "Dnyaneshwari";
        saving.balance = 1000;
        saving.interestRate = 5;
        saving.deposit(1000);
        saving.applyInterest();

        CurrentAccount current = new CurrentAccount();
        current.accountHolderName = "Dnyaneshwari";
        current.balance = 2000;
        current.overdraftLimit = 5000;
        current.deposit(500);
        
        
    }
}