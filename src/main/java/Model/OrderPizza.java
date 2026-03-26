package Model;

class OrderPizza implements Command{
    private Order order;

    public OrderPizza(Order order){
        this.order = order;
    }

    public void execute(){
        order.orderPizza();
    }
}
