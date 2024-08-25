package four_pillars_of_oop.no_01_encapsulation.no_04_security.java;

public class UserAccount {
    private String username;  // Private attributes
    private String encryptedPassword;

    public UserAccount(String username, String password) {
        this.username = username;
        this.encryptedPassword = encryptPassword(password);
    }

    private String encryptPassword(String password) {
        // Simplified encryption (for demonstration purposes)
        return new StringBuilder(password).reverse().toString();
    }

    public boolean checkPassword(String password) {
        return encryptedPassword.equals(encryptPassword(password));
    }
}
