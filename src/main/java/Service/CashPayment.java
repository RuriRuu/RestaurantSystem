package Service;

class CashPayment implements PaymentStrategy{
    public void pay() {
        System.out.println("Payment Method: Cash");
    }
}
