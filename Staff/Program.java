package Staff;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] { "Andrew", "Ban", "Calvin", "Dave", "Eugene" };
        String[] surnames = new String[] {
                "Adamson", "Bates", "Cowell", "Duncan", "Enderson", "Farrell", "Goldman", "Hodges", "Kendal",
                "Lampkin" };

        int age = random.nextInt(18, 45);
        double salary = random.nextInt(20000, 80000);

        double kpi = random.nextDouble(0.5, 1.5);

        double freelance = random.nextInt(200, 1000);
        int hours = random.nextInt(100, 200);

        int bonus = random.nextInt(20000, 80000);

        int value = random.nextInt(3);
        switch (value) {
            case 0:
                return new Worker(
                        names[random.nextInt(names.length)],
                        surnames[random.nextInt(surnames.length)],
                        age, salary, kpi);
            case 1:
                return new Freelancer(
                        names[random.nextInt(names.length)],
                        surnames[random.nextInt(surnames.length)],
                        age, freelance, hours);
            case 2:
                return new Director(
                        names[random.nextInt(names.length)],
                        surnames[random.nextInt(surnames.length)],
                        age, salary, bonus);
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        int teamCount = 10;

        Employee[] employees = new Employee[teamCount];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        // Arrays.sort(employees, new AgeComparator());
        Arrays.sort(employees); // Имя + фамилия

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
