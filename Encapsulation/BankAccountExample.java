
class BankAccount {
    private double balance;
    private String accountHolderName;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Dnyaneshwari", 1000);

        account.displayDetails();
        account.deposit(500);
        account.withdraw(200);
        account.displayDetails();
    }
}
