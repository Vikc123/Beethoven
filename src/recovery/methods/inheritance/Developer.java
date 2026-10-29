package recovery.methods.inheritance;

public class Developer extends Employee {
    private int completedProjects;

    public Developer(String name, int age, double baseSalary, int completedProjects) {
        super(name, age, baseSalary);
        this.completedProjects = completedProjects;
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.completedProjects * 5000;
    }

    public void work() {
        System.out.print("Программист пишет код");
    }
}
