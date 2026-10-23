public class Example {
    public static void main(String[] args) {
        
    }
}

interface Ipayment {
    void PaymentProcess(double amount);
    void generateReceipt();
}

class CreditCardPayment implements Ipayment {
    String cardNumber;


    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override 
    public void PaymentProcess(double amount) {
        System.out.println("Card payment: Rs " + amount + " using card " + cardNumber);
    }
    @Override 
    public void generateReceipt() {
        System.out.println("Credit card receipt generated.");
    }
}

class UpiPayment implements Ipayment {
    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override 
    public void PaymentProcess(double amount) {
        System.out.println("UPI payment: Rs " + amount + " using UPI ID " + upiId);
    }

    @Override 
    public void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }
}

class Netbanking implements Ipayment {
    String bankName;

    public Netbanking(String bankName) {
        this.bankName = bankName;
    }
    @Override 
    public void PaymentProcess(double amount) {
        System.out.println("Netbanking payment: Rs " + amount+ " through " + bankName);
    }
    @Override 
    public void generateReceipt() {
        System.out.println("Netbanking receipt generated.");
    }
}

class PaymentService{

}
    

