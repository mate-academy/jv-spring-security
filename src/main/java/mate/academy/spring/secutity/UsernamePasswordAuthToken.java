package mate.academy.spring.secutity;

public class UsernamePasswordAuthToken implements Token {
    private String userName;
    private String password;

    public UsernamePasswordAuthToken(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String getCredentials() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }
}
