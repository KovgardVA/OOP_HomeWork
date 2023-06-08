package Staff;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surname;
    protected double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
   
    public String getSurname() {
        return surname;
    }
    
    public double getSalary() {
        return salary;
    }
    
    /**
     * Расчет среднемесячной 
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int result =  name.compareTo(o.name);
        if (result == 0) {
            return Double.compare(calculateSalary(), o.calculateSalary());
        } else {
            return result;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s %s; Заработная плата: %.2f руб.",
                surname, name, calculateSalary());
    }
}
