package ls7tap12_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = input.nextInt();
        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            Scanner input1 = new Scanner(System.in);
            System.out.println(i+1 + " Student");
            System.out.print("Enter name: ");
            String name = input1.nextLine();
            System.out.print("Enter surname: ");
            String surname = input1.nextLine();
            System.out.print("Enter age: ");
            String age = input1.nextLine();
            System.out.print("Enter note: ");
            String not = input1.next();

            Student student = new Student(name,surname,age,not);
            students[i] = student;
            System.out.println();

        }
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getInfo());
            System.out.println("--------------------------");

        }




    }
}
