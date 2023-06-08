package Staff;

public class Director extends Employee{
    private int bonus;

    public Director(String name, String surname, int age, double salary, int bonus) {
        super(name, surname, age, salary);
        this.bonus = bonus;
    }
    
    public int getBonus() {
        return bonus;
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
