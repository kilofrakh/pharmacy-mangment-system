import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Create medicines
        // 3ml 2adwya
        Medicine med1 = new Medicine("M001", "Paracetamol", "Painkiller", 10.0, 100, new Date(System.currentTimeMillis() + 86400000)); // +1 day
        Medicine med2 = new Medicine("M002", "Amoxicillin", "Antibiotic", 25.0, 50, new Date(System.currentTimeMillis() + 172800000)); // +2 days

        // Admin actions
        // 2a3mal el admin
        admin admin = new admin("A001", "Alice", "alice@pharmacy.com");
        admin.login();
        admin.addMedicine(med1);
        admin.addMedicine(med2);
        admin.viewSalesReport();
        admin.logout();

        // Pharmacist actions
        // 2a3mal el pharmacist
        Pharmacist pharmacist = new Pharmacist("P001", "Bob", "bob@pharmacy.com");
        pharmacist.login();
        List<Medicine> prescriptionMeds = new ArrayList<>();
        prescriptionMeds.add(med1);
        Prescription prescription = new Prescription("RX001", "John Doe", "Dr. Smith", new Date(), prescriptionMeds);
        pharmacist.processPrescription(prescription);
        pharmacist.dispenseMedicine(med1);
        pharmacist.logout();

        // Customer actions
        // 2a3mal el customer
        Customer customer = new Customer("C001", "Carol", "carol@pharmacy.com");
        customer.login();
        customer.viewMedicines(List.of(med1, med2));
        Sale sale = new Sale("S001", customer.name, List.of(med1, med2));
        customer.makePurchase(sale);
        customer.logout();
    }
}
