package Staff;

public class Freelancer extends Employee {
    private int hours;

    public Freelancer(String name, String surname, int age, double salary, int hours) {
        super(name, surname, age, salary);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
    
    @Override
    public double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return "Фрилансер; " + super.toString() + "(за отработанные часы)";
    }
}
