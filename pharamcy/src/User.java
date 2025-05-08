public abstract class User {
    protected String userId; // ID bta3 el user
    protected String name; // Esm el user
    protected String email; // Email bta3 el user
    protected String role; // Role bta3 el user (Admin, Pharmacist, etc.)

    public User(String userId, String name, String email, String role) {
        this.userId = userId; // 7ot el ID
        this.name = name; // 7ot el esm
        this.email = email; // 7ot el email
        this.role = role; // 7ot el role
    }

    public void login() {
        System.out.println(name + " logged in as " + role); // El user dakhal el system
    }

    public void logout() {
        System.out.println(name + " logged out"); // El user kharag mn el system
    }
}
