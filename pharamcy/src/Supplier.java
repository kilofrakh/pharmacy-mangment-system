import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String supplierId; // ID bta3 el supplier
    private String name; // Esm el supplier
    private String contactInfo; // El contact info bta3 el supplier
    private List<String> orderHistory; // El tareekh bta3 el orders

    public Supplier(String id, String name, String contact) {
        this.supplierId = id; // 7ot el ID bta3 el supplier
        this.name = name; // 7ot el esm bta3 el supplier
        this.contactInfo = contact; // 7ot el contact info bta3 el supplier
        this.orderHistory = new ArrayList<>(); // 7ot list fadya lel orders
    }

    public void placeOrder(String medicine, int quantity) {
        String order = "Ordered " + quantity + " of " + medicine; // 3amel order lel dawa
        orderHistory.add(order); // Zawed el order fel tareekh
        System.out.println(order); // 3ard el order
    }

    public void viewOrderHistory() {
        System.out.println("Order History:"); // Shoof el tareekh bta3 el orders
        for (String order : orderHistory) {
            System.out.println(order); // 3ard kol order
        }
    }
}