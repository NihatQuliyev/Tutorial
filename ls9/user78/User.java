package user78;

import java.util.Scanner;

public class User {
    String password ;


    public void setPassword(String pasword) {
        this.password = pasword;
    }
    public void checkPasword(String password){
        if(this.password.equals(password)){
            System.out.println("Password in correct");
        }
        else{
            System.err.println("Password incorrect");
        }
    }
    public boolean changePassword()
    {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Evelki kodunuzu daxil edin: ");
            String oldPassword = input.next();
            if (this.password.equals(oldPassword)){
                System.out.print("Yeni kodunuzu daxil ediniz: ");
                String newPassword = input.nextLine();
                this.password = newPassword;
                break;
            }
            else{
                System.err.println("oldPassword incorrect");
            }
        }
        return true;
    }
}
