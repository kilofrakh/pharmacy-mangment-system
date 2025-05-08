import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String supplierId;
    private String name;
    private String contactInfo;
    private List<String> orderHistory;

    public Supplier(String id, String name, String contact) {
        this.supplierId = id;
        this.name = name;
        this.contactInfo = contact;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(String medicine, int quantity) {
        String order = "Ordered " + quantity + " of " + medicine;
        orderHistory.add(order);
        System.out.println(order);
    }

    public void viewOrderHistory() {
        System.out.println("Order History:");
        for (String order : orderHistory) {
            System.out.println(order);
        }
    }
}