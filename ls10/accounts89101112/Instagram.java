package accounts89101112;

public class Instagram extends Facebook{
    String securityGmail;
    private String gmailPassword;

    public Instagram(String name, String surname, String birthday, String username, String securityGmail) {
        super(name, surname, birthday, username);
        this.securityGmail = securityGmail;
    }

    public String getSecurityGmail() {
        return securityGmail;
    }

    public void setSecurityGmail(String securityGmail) {
        this.securityGmail = securityGmail;
    }

    public void setGmailPassword(String gmailPassword) {
        this.gmailPassword = gmailPassword;
    }
    public void years(){
        System.out.println("2010");
    }
}
