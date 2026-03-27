package Service;

public class Server {
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void placeOrder() {
        order.execute();
    }
}
