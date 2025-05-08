public  class admin extends User {
    public admin(String userId, String name, String email) {
        super(userId, name, email, "Admin");
    }

    public void addMedicine(Medicine med) {
        System.out.println("Added medicine: " + med.getName());
    }

    public void updateMedicine(Medicine med) {
        System.out.println("Updated medicine: " + med.getName());
    }

    public void removeMedicine(Medicine med) {
        System.out.println("Removed medicine: " + med.getName());
    }

    public void addEmployee(User employee) {
        System.out.println("Added employee: " + employee.name);
    }

    public void viewSalesReport() {
        System.out.println("Viewing sales report...");
    }

    public void manageSuppliers() {
        System.out.println("Managing suppliers...");
    }

}
