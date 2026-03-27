package Service;

public class OrderBurger implements Order{
    private Kitchen kitchen;
    private KitchenOrderTracker tracker;

    public OrderBurger(Kitchen kitchen, KitchenOrderTracker tracker){
        this.kitchen = kitchen;
        this.tracker = tracker;
    }

    @Override
    public void execute(){
        kitchen.prepareBurger();
        tracker.finishOrder("Burger");
    }
}
