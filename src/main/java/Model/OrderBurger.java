package Model;

class OrderBurger implements Command{
    private Order order;

    public OrderBurger(Order order){
        this.order = order;
    }

    public void execute(){
        order.orderBurger();
    }
}