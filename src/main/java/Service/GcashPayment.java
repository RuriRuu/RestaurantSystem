package Service;

class GcashPayment implements PaymentStrategy{
    public void pay() {
        System.out.println("Payment Method: GCash");
    }
}
