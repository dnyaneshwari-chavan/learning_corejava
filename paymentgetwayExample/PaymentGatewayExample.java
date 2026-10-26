import java.util.Scanner;

public class PaymentGatewayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select payment method: 1. Credit card  2. UPI  3. Net banking");
        int choice = sc.nextInt();

        System.out.println("Enter amount:");
        double amount = sc.nextDouble();
        sc.nextLine(); // Consume the leftover newline

        Payment payment;

        switch (choice) {
            case 1:
                System.out.println("Enter credit card number:");
                payment = new CreditCardPayment(sc.nextLine());
                break;

            case 2:
                System.out.println("Enter UPI ID:");
                payment = new UpiPayment(sc.nextLine());
                break;

            case 3:
                System.out.println("Enter user ID:");
                payment = new NetbankingPayment(sc.nextLine());
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        PaymentService service = new PaymentService(payment);
        service.executePayment(amount);

        sc.close();
    }
}

abstract class Payment {
    public abstract void processPayment(double amount);

    public abstract void generateReceipt();
}

class CreditCardPayment extends Payment {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Card payment: Rs " + amount + " using card " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit card receipt generated.");
    }
}

class UpiPayment extends Payment {
    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI payment: Rs " + amount + " using UPI ID " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }
}

class NetbankingPayment extends Payment {
    private final String userId;

    public NetbankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Net banking payment: Rs " + amount + " for user " + userId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net banking receipt generated.");
    }
}

class PaymentService {
    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.processPayment(amount);
        payment.generateReceipt();
    }
}