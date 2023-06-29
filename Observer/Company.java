package Observer;

import java.util.Random;

public class Company {
    Random random = new Random();

    private String companyName;
    private double maxSalary;

    private Publisher jobAgancy;

    public Company(String companyName, double maxSalary, Publisher jobAgancy) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgancy = jobAgancy;
    }

    public void needEmployee() {
        double salary = random.nextDouble(3000, maxSalary);
        Vacancy vacancy = new Vacancy(companyName, salary);
        jobAgancy.sendOffer(vacancy);
        // jobAgancy.sendOffer(companyName, salary);
    }

}
