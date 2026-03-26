package Model;

import java.util.concurrent.TimeUnit;

public class Kitchen implements Order{
    @Override
    public void orderBurger() {
        System.out.println("Preparing Burger...");
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Burger Ready!");
    }

    @Override
    public void orderPizza() {
        System.out.println("Ordered a pizza");
    }
}
