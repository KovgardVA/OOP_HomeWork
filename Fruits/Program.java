package Fruits;

public class Program {
    public static void main(String[] args) {

        Box<Orange> boxOrange1 = new Box<>("Бабушкины апельсины");
        boxOrange1.add(new Orange());
        boxOrange1.add(new Orange());
        System.out.println(boxOrange1);

        Box<Apple> boxApple1 = new Box<>("Дедушкины яблоки");
        boxApple1.add(new Apple());
        boxApple1.add(new Apple());
        boxApple1.add(new Apple());
        System.out.println(boxApple1);

        Box<Apple> boxApple2 = new Box<>("Бабушкны яблоки");
        System.out.println(boxApple2);

        boxApple2.removeTo(boxApple1);
        boxApple1.removeTo(boxApple2);

        if (boxOrange1.compare(boxApple1))
            System.out.printf("Коробки весят одинаково! %.1f условных единиц.\n",
                    boxApple1.getWeight());
        else
            System.out.printf("Коробки весят по-разному!\n%s: %.1f, а %s: %.1f",
                    boxOrange1.getName(), boxOrange1.getWeight(),
                    boxApple1.getName(), boxApple1.getWeight());

    }
}
