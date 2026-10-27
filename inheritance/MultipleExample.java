
public class MultipleExample {
    public static void main(String[] args) {
        SmartAccount account = new SmartAccount();

        account.accountHolderName = "Rahul";
        account.deposit(500);
        account.applyLoan(1000);
    }
}

interface AccountOperation {
    void deposit(double amount);
}

interface LoanOperation {
    void applyLoan(double amount);
}

class SmartAccount implements AccountOperation, LoanOperation {
    String accountHolderName;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " " + balance);
    }

    public void applyLoan(double amount) {
        balance += amount;
        System.out.println("Loan Approved: "+ amount + ".New Balance:"+ balance);
    }
}
