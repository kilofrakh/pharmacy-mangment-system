public class Pharmacist {
    public Pharmacist(String userId, String name, String email) {
        super(userId, name, email, "Pharmacist");
    }

    public void processPrescription(Prescription p) {
        System.out.println("Processing prescription: " + p.getPrescriptionId());
    }

    public void dispenseMedicine(Medicine med) {
        System.out.println("Dispensing: " + med.getName());
    }

    public void checkStock(Medicine med) {
        System.out.println("Stock of " + med.getName() + ": " + med.getStockQuantity());
    }
}
