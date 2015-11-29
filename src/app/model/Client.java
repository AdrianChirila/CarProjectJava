package app.model;

/**
 * Created by Chirila on 11/28/2015.
 */
public class Client {
    Integer id;
    String fullName;
    Boolean vip;
    int rents = 0;
    String userName;
    String password;

    public Client(String fullName, boolean vip,
                  String userName, String password) {
        this.vip = vip;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }
}
