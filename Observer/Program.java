package Observer;

public class Program {
    public static void main(String[] args) {
        JobAgancy agancy1 = new JobAgancy();

        Company geekBrains = new Company("GeekBrains", 70000, agancy1);
        Company google = new Company("Google", 100000, agancy1);
        Company yandex = new Company("Yandex", 120000, agancy1);

        Master master1 = new Master("Ivanov");
        Master master2 = new Master("Petrov");
        Student student1 = new Student("Sidorov");

        agancy1.registerObserver(student1);
        agancy1.registerObserver(master1);
        agancy1.registerObserver(master2);

        for (int i = 0; i < 10; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }
}
