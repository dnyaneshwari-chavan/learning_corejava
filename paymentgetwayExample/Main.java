public class Main{
    public static void main(String[] args){
        CreditCardPayment obj = new CreditCardPayment("1234567890");
        obj.PaymentProcess(100);
        obj.generateReceipt();

    }
}
interface Ipayment{
    void PaymentProcess(double amount);

    void generateReceipt();
}
class CreditCardPayment implements Ipayment {
      String CardNumber;
      public CreditCardPayment(String CardNumber){
        this.CardNumber = CardNumber;

      }

    @Override
      public void PaymentProcess(double amount){

        System.out.println("Processing card payment of Rs:"+ amount+" using card number:"+ CardNumber);
      }

    @Override
      public void generateReceipt(){
        System.out.println("Credit card payment Receipt Generated.");
         
      }


}
class UpiPayment implements Ipayment{
    
    class CreditCardPayment implements Ipayment {
      String CardNumber;
      public CreditCardPayment(String CardNumber){
        this.CardNumber = CardNumber;

      }

    @Override
      public void PaymentProcess(double amount){

        System.out.println("Processing card payment of Rs:"+ amount+" using card number:"+ CardNumber);
      }

    @Override
      public void generateReceipt(){
        System.out.println("Credit card payment Receipt Generated.");
         
      }

}
class Netbanking{

}
class PaymentService{

}
