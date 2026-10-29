package recovery.methods.inheritance;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double baseSalary, double bonus) {
        super(name, age, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return this.getBaseSalary() + this.bonus;
    }

    @Override
    public void work() {
        System.out.print("Менеджер управляет командой");
    }
}
