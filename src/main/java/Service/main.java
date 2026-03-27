package Service;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        KitchenOrderTracker tracker = new KitchenOrderTracker();

        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        Customer customer = new Customer(name);
        tracker.addObserver(customer);

        try{
            System.out.println("_______________________");
            System.out.println("Select a Payment Method");
            System.out.println("_______________________");
            System.out.println("1. Cash");
            System.out.println("2. GCash");
            System.out.println("3. Credit Card");

            System.out.print("Choice: ");
            int choice = scan.nextInt();

            PaymentContext context = new PaymentContext();

            switch (choice){
                case 1:
                    context.setStrategy(new CashPayment());
                    context.executePayment();
                    break;
                case 2:
                    context.setStrategy(new GcashPayment());
                    context.executePayment();
                    break;
                case 3:
                    context.setStrategy(new CreditCardPayment());
                    context.executePayment();
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }

        }catch (Exception e){
            System.out.println("Error, please try again.");
        }

        try {
            System.out.println("___________________");
            System.out.println("Burger or Pizza?");
            System.out.println("___________________");
            System.out.println("1. Burger - 40php");
            System.out.println("2. Pizza - 555php");

            System.out.print("Choice: ");
            int choice = scan.nextInt();

            Kitchen kitchen = new Kitchen();
            Server server = new Server();

            if (choice == 1){
                server.setOrder(new OrderBurger(kitchen, tracker));
                server.placeOrder();
            } else if (choice == 2) {
                server.setOrder(new OrderPizza(kitchen, tracker));
                server.placeOrder();
            } else {
                System.out.println("Invalid Selection.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        scan.close();
    }




}
