package Service;
import java.util.ArrayList;
import java.util.List;

public class KitchenOrderTracker implements OrderSubject {
    private List<OrderObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String orderName) {
        for (OrderObserver observer : observers) {
            observer.update(orderName);
        }
    }

    public void finishOrder(String orderName){
        System.out.println("Kitchen: " + orderName + " is done!");
        notifyObservers(orderName);
    }
}

