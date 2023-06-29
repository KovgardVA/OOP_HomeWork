package Observer;

import java.util.Random;

public class Director implements Observer{
    private static Random random = new Random();

    private String name;
    private double minSalary;

    public Director(String name) {
        this.name = name;
        minSalary = random.nextDouble(100000, 200000);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("Руководитель отдела %s >>> Мне нужна эта работа. [%s - %f]\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
            minSalary = vacancy.getSalary();
        } else {
            System.out.printf("Руководитель отдела %s >>> Я найду работу получше (%f). [%s - %f]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
        }
    }
}
