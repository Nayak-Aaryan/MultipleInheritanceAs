package Q2pack;

public interface PaymentGateway {
    public void processPayment(double amount);
}
--------------------------------------------------
package Q2pack;

public interface OrderDetails {
    public void showOrderDetails();
}
-------------------------------------------------
package Q2pack;

public class OnlineOrder implements PaymentGateway, OrderDetails {
    private int orderID;
    private String customerName;
    private double amount;

    public OnlineOrder(int orderID, String customerName, double amount) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Payment Amount");
        } else if (amount >= 5000) {
            double discount = amount * 0.05;
            double finalAmount = amount - discount;
            System.out.println("Discount Applied: " + discount);
            System.out.println("Final Payment: " + finalAmount);
        } else {
            System.out.println("Payment Successful: " + amount);
        }
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Amount: " + amount);
    }

    public void confirmOrder() {
        showOrderDetails();
        processPayment(amount);
    }
}
------------------------------------------------------------------------
import Q2pack.OnlineOrder;

public class Q2 {
    public static void main(String[] args) {

        OnlineOrder o = new OnlineOrder(101, "Aaryan", 6000);

        o.confirmOrder();

    }
}
