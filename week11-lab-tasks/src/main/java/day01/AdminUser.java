package day01;

public class AdminUser implements User{
    private String mail;
    private String password;

    public AdminUser(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return mail;
    }

    @Override
    public String getPassword() {
        return "*".repeat(password.length());
    }
}
