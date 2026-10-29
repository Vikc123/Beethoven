package recovery;

import recovery.methods.inheritance.Employee;
import recovery.methods.inheritance.Developer;
import recovery.methods.inheritance.Manager;
import recovery.methods.inheritance.Intern;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Developer("Иван", 25, 60000, 3);
        employees[1] = new Manager("Анна", 30, 70000, 20000);
        employees[2] = new Intern("Олег", 19, 0, 100);
        employees[3] = new Developer("Мария", 27, 80000, 5);

        double totalSalary = 0;

        for (int i = 0; i < 4; i++) {
            employees[i].printInfo();
            employees[i].work();

            double salary = employees[i].calculateSalary();
            System.out.println("Зарплата: " + salary);

            totalSalary += salary;
        }

        System.out.println("Общая зарплата: " + totalSalary);
    }
}