import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("register etmek ucun 1 \nsistemden cixmaq ucun 2 ni basin: ");
        int go = input.nextInt();
        if (go == 2) {
            System.exit(-1);
        }
        System.out.print("Enter employee number: ");

        int count = input.nextInt();

        Employee[] employes = new Employee[count];


        for (int i = 0; i < count; i++) {
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = input1.nextLine();
            System.out.print("Enter surname: ");
            String surname = input1.nextLine();
            System.out.print("Enter age: ");
            String age = input1.nextLine();
            System.out.print("Enter position: ");
            String position = input1.nextLine();
            System.out.print("Enter salary: ");
            double salary = input1.nextDouble();
            Scanner input2 = new Scanner(System.in);

            System.out.print("Enter language: ");
            String language = input2.nextLine();
            System.out.print("Enter programingLanguage: ");
            String programingLanguage = input2.nextLine();
            System.out.print("Enter technology: ");
            String technology = input2.nextLine();
            Skill skill = new Skill(language, programingLanguage, technology);
            Employee employee = new Employee(name, surname, age, position, salary, skill);

            employes[i] = employee;
            System.out.println();


        }
        Scanner input3 = new Scanner(System.in);
        System.out.print("user: ");
        String user = input3.nextLine();
        for (int i = 0; i < count; i++) {
            if (user == employes[i].name) {
                System.out.println("Nihat");
                employes[i].getInfo();
            }
        }
        while (true) {
            System.out.println("1 - Look list \n 2 - Exit");
            System.out.print(" 1  or 2 :  ");
            int oneOrTwo = input.nextInt();
            if (oneOrTwo == 2) {
                System.exit(-1);
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.println("---------------------");
                    employes[i].getInfo();
                    System.out.println("---------------------");
                }

            }

        }

    }

}

