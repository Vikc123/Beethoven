package recovery.methods.inheritance;

public abstract class Employee {
    private String name;
    private int age;
    private double baseSalary;

    public Employee(){}

    public Employee(String name, int age, double baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void printInfo() {
        System.out.print(this.name);
        System.out.print(this.age);
        System.out.print(this.baseSalary);
    }

    public void work() {
        System.out.print("Сотрудник выполняет работу");
    }

    public abstract double calculateSalary();
}
