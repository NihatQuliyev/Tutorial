package service.impl;

import exception.EmployeeNotFoundException;
import exception.EmployeeNotFoundId;
import exception.EmployeeNotFoundParameter;
import globalData.GlobalData;
import model.Employee;

import static util.InputUtil.*;

public class EmployeeService implements service.EmployeeService {
    static long id = 0;


    static Employee fillEmployee()  {
            String name = stringInput("Enter the name: ");
            String surname = stringInput("Enter the surname: ");
            String birthday = stringInput("Enter the birthday: ");
            String department = stringInput("Enter the department: ");
            String position = stringInput("Enter the position: ");
            long salary = longInput("Enter the salary: ");
            Employee employee = new Employee(++id, name, surname, birthday, department, position, salary);
            return employee;
    }


    @Override
    public boolean register() {
        short count = shortInput("How many Employee register? : ");
        if (GlobalData.employees == null) {
            GlobalData.employees = new Employee[count];
            for (int i = 0, k = 0; i < GlobalData.employees.length; i++) {
                System.out.println("--------------");
                System.out.println(++k + " . Employee");
                GlobalData.employees[i] = fillEmployee();
                System.out.println("--------------");
                System.out.println("update successfully");

            }

        } else {
            Employee[] tempEmployee = GlobalData.employees;
            GlobalData.employees = new Employee[GlobalData.employees.length + count];
            for (int i = 0, k = 0; i < GlobalData.employees.length; i++) {
                if (i < tempEmployee.length) {
                    GlobalData.employees[i] = tempEmployee[i];
                } else {
                    System.out.println("--------------");
                    System.out.println(++k + " . Employee : ");
                    GlobalData.employees[i] = fillEmployee();
                }
            }
        }
        return false;
    }

    @Override
    public void show() throws EmployeeNotFoundException {
        if (GlobalData.employees == null) {
            throw new  EmployeeNotFoundException();
        }
        else {
            for (int i = 0; i < GlobalData.employees.length; i++) {
                System.out.println("----------");
                System.out.println(i + 1 + " . Employee");
                System.out.println(GlobalData.employees[i]);
            }
        }

    }

    @Override
    public boolean update() throws EmployeeNotFoundException , EmployeeNotFoundId , EmployeeNotFoundParameter {
        if (GlobalData.employees == null) {
        throw new EmployeeNotFoundException();
        }
         else {
            short id = shortInput("Enter the id: ");
            if (id>GlobalData.employees.length){
                throw new EmployeeNotFoundId();
            }
            else {
                for (int i = 0; i < GlobalData.employees.length; i++) {
                    if (GlobalData.employees[i].getId() == id) {
                        String parameters = stringInput("Enter the parameter: ");
                        String[] strings = parameters.toLowerCase().split(",");
                        for (int j = 0; j < strings.length; j++) {
                            if (strings[j].equals("name")) {
                                GlobalData.employees[i].setName(stringInput("Enter the update name: "));
                            }
                            if (strings[j].contains("surname") && !strings[j].equals("name")) {
                                GlobalData.employees[i].setSurname(stringInput("Enter the update surname: "));
                            }
                            if (strings[j].contains("birthday")) {
                                GlobalData.employees[i].setBirthday(stringInput("Enter the update birthday: "));
                            }
                            if (strings[j].contains("department")) {
                                GlobalData.employees[i].setDepartment(stringInput("Enter the update department: "));
                            }
                            if (strings[j].contains("position")) {
                                GlobalData.employees[i].setPosition(stringInput("Enter the update position: "));
                            }
                            if (strings[j].contains("salary")) {
                                GlobalData.employees[i].setSalary(shortInput("Enter the update salary: "));
                            }
                            else{
                                throw new EmployeeNotFoundParameter();
                            }
                        }
                    }
                }
            }
        }
        return false;

    }

    @Override
    public boolean delete() throws EmployeeNotFoundException , EmployeeNotFoundId {
        if (GlobalData.employees == null){
            throw new  EmployeeNotFoundException();
        }
        else {
            long id = longInput("Enter the id: ");
            if (id>GlobalData.employees.length){
                throw new EmployeeNotFoundId();
            }
            for (Employee employee : GlobalData.employees) {
                if (employee.getId() == id) {
                    Employee[] tempEmployee = GlobalData.employees;
                    GlobalData.employees = new Employee[tempEmployee.length - 1];
                    int k = 0;
                    for (Employee newEmployee : tempEmployee) {
                        if (newEmployee.getId() == id)
                            continue;
                        GlobalData.employees[k] = newEmployee;
                        k++;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void findByName() throws EmployeeNotFoundException{
        if(GlobalData.employees ==null){
            throw new EmployeeNotFoundException();
        }
        else{
            String name = stringInput("Enter the name: ");
            for (int i = 0; i < GlobalData.employees.length; i++) {
                if (GlobalData.employees[i].getName().contains(name)) {
                    System.out.println(GlobalData.employees[i]);
                    System.out.println("------------");
                } else {
                    throw new  EmployeeNotFoundException();
                }
            }
        }
    }

    @Override
    public void totalEmployee() throws EmployeeNotFoundException {
        if (GlobalData.employees == null) {
            throw new EmployeeNotFoundException();
        }
        else {

            System.out.println("Employee count: " + GlobalData.employees.length);
        }
    }
}

