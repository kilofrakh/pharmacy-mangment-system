public class Pharmacist extends User {
    public Pharmacist(String userId, String name, String email) {
        super(userId, name, email, "Pharmacist"); // 7ot el ID, el esm, w el email lel pharmacist
    }

    public void processPrescription(Prescription p) {
        System.out.println("Processing prescription: " + p.getPrescriptionId()); // 3amel prescription
    }

    public void dispenseMedicine(Medicine med) {
        System.out.println("Dispensing: " + med.getName()); // Sraf dawa
    }

    public void checkStock(Medicine med) {
        System.out.println("Stock of " + med.getName() + ": " + med.getStockQuantity()); // Shoof el stock bta3 el dawa
    }
}
