package day01;

public class NormalUser implements User{
    private String mail;
    private String password;

    public NormalUser(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return mail;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
