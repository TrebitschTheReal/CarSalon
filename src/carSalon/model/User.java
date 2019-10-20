package carSalon.model;

public class User {
    private String userName;
    private String password;
    private int userSecurityLevel = -1;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getUserSecurityLevel() {
        return userSecurityLevel;
    }

    public void setUserSecurityLevel(int userSecurityLevel) {
        this.userSecurityLevel = userSecurityLevel;
    }
}
