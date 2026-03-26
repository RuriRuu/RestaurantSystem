package Service;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        askPaymentMethod();
    }

    private static void askPaymentMethod() {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("_______________________");
            System.out.println("Select a Payment Method");
            System.out.println("_______________________");
            System.out.println("1. Cash");
            System.out.println("2. GCash");
            System.out.println("3. Credit Card");
            int choice = scan.nextInt();
            scan.close();

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
    }

    private static void askOrder(){
        Scanner scan = new Scanner(System.in);
        System.out.println("___________________");
        System.out.println("Burger or Pizza?");
        System.out.println("___________________");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");

        int choice = scan.nextInt();
        scan.close();
    }
}
