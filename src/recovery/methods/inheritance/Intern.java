package recovery.methods.inheritance;

public class Intern extends Employee{
    private int hoursWorked;

    public Intern(String name, int age, double baseSalary, int hoursWorked) {
        super(name, age, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return this.hoursWorked*300;
    }

    @Override
    public void work() {
        System.out.print("Стажер проходит обучение");
    }
}
