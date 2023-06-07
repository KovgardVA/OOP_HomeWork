package Se003.Ex001;

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
        return String.format("%s %s; Рабочий; Зарплата (фикс): %.2f (руб.)",
                surname, name, calculateSalary());
    }
}
