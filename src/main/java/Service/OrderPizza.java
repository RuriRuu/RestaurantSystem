package Service;

public class OrderPizza implements Order{
    private Kitchen kitchen;
    private KitchenOrderTracker tracker;

    public OrderPizza(Kitchen kitchen, KitchenOrderTracker tracker){
        this.kitchen = kitchen;
        this.tracker = tracker;
    }

    @Override
    public void execute(){
        kitchen.preparePizza();
        tracker.finishOrder("Pizza");
    }
}
