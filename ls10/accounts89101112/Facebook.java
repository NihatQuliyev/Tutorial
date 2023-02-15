package accounts89101112;

public class Facebook extends Me{
    String username;
    private String password;

    public Facebook(String name, String surname, String birthday, String username) {
        super(name, surname, birthday);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void years(){
        System.out.println("2004");

    }
}
