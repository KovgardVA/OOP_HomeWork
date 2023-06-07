package Staff;

public class Freelancer extends Employee {
    private int hours;

    public Freelancer(String name, String surname, double salary, int hours) {
        super(name, surname, salary);
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return salary * hours;
    }
    
}
