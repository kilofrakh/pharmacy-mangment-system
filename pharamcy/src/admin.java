public class admin extends User {
    public admin(String userId, String name, String email) {
        super(userId, name, email, "Admin"); // 7ot el ID, el esm, w el email lel admin
    }

    public void addMedicine(Medicine med) {
        System.out.println("Added medicine: " + med.getName()); // Zawed dawa
    }

    public void updateMedicine(Medicine med) {
        System.out.println("Updated medicine: " + med.getName()); // 3adel 3ala dawa
    }

    public void removeMedicine(Medicine med) {
        System.out.println("Removed medicine: " + med.getName()); // Shil dawa
    }

    public void addEmployee(User employee) {
        System.out.println("Added employee: " + employee.name); // Zawed employee
    }

    public void viewSalesReport() {
        System.out.println("Viewing sales report..."); // Shoof el sales report
    }

    public void manageSuppliers() {
        System.out.println("Managing suppliers..."); // Dayer el suppliers
    }
}
