import java.util.Date;
import java.util.List;

public class Sale {
    private String saleId;
    private String customerName;
    private List<Medicine> medicineList;
    private double totalAmount;
    private Date date;

    public Sale(String saleId, String customerName, List<Medicine> medicineList) {
        this.saleId = saleId;
        this.customerName = customerName;
        this.medicineList = medicineList;
        this.date = new Date();
        this.totalAmount = calculateTotal();
    }

    public double calculateTotal() {
        return medicineList.stream().mapToDouble(Medicine::getPrice).sum();
    }

    public void generateInvoice() {
        System.out.println("Invoice for: " + customerName);
        for (Medicine m : medicineList) {
            System.out.println("- " + m.getName() + ": $" + m.getPrice());
        }
        System.out.println("Total: $" + totalAmount);
    }
}
