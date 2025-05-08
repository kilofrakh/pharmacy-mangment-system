public abstract class User {
    protected String userId;
    protected String name;
    protected String email;
    protected String role;

    public User(String userId, String name, String email, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public void login() {
        System.out.println(name + " logged in as " + role);
    }

    public void logout() {
        System.out.println(name + " logged out");
    }
}
