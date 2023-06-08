package Staff;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surname;
    protected double salary;
    protected int age;

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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
    public String toString() {
        return String.format("%s %s; Возраст: %d; Заработная плата: %.2f руб.",
        name, surname, age, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        int result =  name.compareTo(o.name);
        if (result == 0) {
            return surname.compareTo(o.surname);
        } else {
            return result;
        }
    }
}
