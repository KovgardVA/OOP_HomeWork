package Staff;

public class Worker extends Employee {
    private double kpi;

    public Worker(String name, String surname, double salary, double kpi) {
        super(name, surname, salary);
        this.kpi = kpi;
    }

    @Override
    public double calculateSalary() {
        return salary * kpi;
    }

    @Override
    public String toString() {
        return "Рабочий; " + super.toString() + "(в соответствии с показателями эффективности)";
    }
}
