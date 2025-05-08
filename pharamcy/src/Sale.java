import java.util.Date;
import java.util.List;

public class Sale {
    private String saleId; // ID bta3 el sale
    private String customerName; // Esm el customer
    private List<Medicine> medicineList; // List bta3et el adwya
    private double totalAmount; // El total bta3 el sale
    private Date date; // Tareekh el sale

    public Sale(String saleId, String customerName, List<Medicine> medicineList) {
        this.saleId = saleId; // 7ot el ID bta3 el sale
        this.customerName = customerName; // 7ot esm el customer
        this.medicineList = medicineList; // 7ot list el adwya
        this.date = new Date(); // 7ot tareekh el sale
        this.totalAmount = calculateTotal(); // 7ot el total bta3 el sale
    }

    public double calculateTotal() {
        return medicineList.stream().mapToDouble(Medicine::getPrice).sum(); // 7aseb el total bta3 el adwya
    }

    public void generateInvoice() {
        System.out.println("Invoice for: " + customerName); // 2tlob el invoice lel customer
        for (Medicine m : medicineList) {
            System.out.println("- " + m.getName() + ": $" + m.getPrice()); // 3ard el dawa w el se3r bta3o
        }
        System.out.println("Total: $" + totalAmount); // 3ard el total
    }
}
