package Staff;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();

    static Worker generateEmployee() {
        String[] names = new String[] { "An", "Ba", "Ca", "Da", "Ea" };
        String[] surnames = new String[] { "Fa", "Ga", "Ha", "Ia", "Ja" };

        double salary = random.nextInt(20000, 80000);
        double kpi = random.nextDouble(0.5, 1.0);
        
        return new Worker(
            names[random.nextInt(names.length)],
            surnames[random.nextInt(surnames.length)],
            salary, kpi);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
