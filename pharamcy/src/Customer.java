public class Customer {
    public Customer(String userId, String name, String email) {
        super(userId, name, email, "Customer");
    }

    public void viewMedicines(java.util.List<Medicine> list) {
        for (Medicine med : list) {
            System.out.println(med.getName() + " - $" + med.getPrice());
        }
    }

    public void makePurchase(Sale sale) {
        sale.generateInvoice();
    }
}
