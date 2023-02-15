package userabstract3;


import java.util.Scanner;

public class UserServise extends AbstracktServise {
    @Override
    public void register() {

        Scanner input = new Scanner(System.in);
        User user = new User();
        System.out.print("Enter the name: ");
        user.name = input.nextLine();
        System.out.print("Enter the surname: ");
        user.surname = input.nextLine();
        System.out.print("Enter the age: ");
        user.age = input.nextLine();
        System.out.println(user.name);
        System.out.println(user.surname);
        System.out.println(user.age);
    }


}
