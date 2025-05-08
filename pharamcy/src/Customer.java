public class Customer extends User {
    public Customer(String userId, String name, String email) {
        super(userId, name, email, "Customer"); // 7ot el ID, el esm, w el email lel customer
    }

    public void viewMedicines(java.util.List<Medicine> list) {
        for (Medicine med : list) {
            System.out.println(med.getName() + " - $" + med.getPrice()); // Shoof el asamy w el as3ar bta3et el adwya
        }
    }

    public void makePurchase(Sale sale) {
        sale.generateInvoice(); // 3amel purchase w 2tlob el invoice
    }
}
