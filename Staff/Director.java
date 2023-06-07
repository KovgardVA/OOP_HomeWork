package Se003.Ex001;

public class Director extends Employee{

    public Director(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
    
}
