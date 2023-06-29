package Observer;

import java.util.Random;

public class Student implements Observer {
    private static Random random = new Random();

    private String name;
    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
    }

    // @Override
    // public void receiveOffer(String companyName, double salary) {
    // if (minSalary <= salary) {
    // System.out.printf("Студент %s >>> Мне нужна эта работа. [%s - %f]\n", name,
    // companyName, salary);
    // minSalary = salary;
    // } else {
    // System.out.printf("Студент %s >>> Я найду работу получше (%f). [%s - %f]\n",
    // name, minSalary, companyName, salary);
    // }
    // }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("Студент %s >>> Мне нужна эта работа. [%s - %f]\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
            minSalary = vacancy.getSalary();
        } else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f). [%s - %f]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
        }
    }
}
