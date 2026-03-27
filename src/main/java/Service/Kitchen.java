package Service;

public class Kitchen {
    public void prepareBurger(){
        System.out.println("Preparing Burger...");
        wait(5000);
    }

    public void preparePizza(){
        System.out.println("Preparing Pizza...");
        wait(5000);
    }

    private void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Kitchen was interrupted!");
        }
    }
}
