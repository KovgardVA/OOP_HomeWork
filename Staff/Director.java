package Staff;

public class Director extends Employee{
    private int bonus;

    public Director(String name, String surname, double salary, int bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
    
    @Override
    public String toString() {
        return "Директор; " + super.toString() + "(с премией)";
    }
}
