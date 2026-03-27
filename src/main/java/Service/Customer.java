package Service;

public class Customer implements OrderObserver{
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public void update(String orderName){
        System.out.println(name + "'s " + orderName + " is ready!" );
    }
}
