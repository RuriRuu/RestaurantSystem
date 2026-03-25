package Service;

public class GcashPayment implements PaymentStrategy{
    public void pay(int amount) {
        System.out.println("Paid"+amount+" using GCash");
    }
}
