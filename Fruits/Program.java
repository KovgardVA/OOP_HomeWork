package Fruits;

public class Program {
    public static void main(String[] args) {
        
        Box<Orange> boxOrange1 = new Box<>("Бабушкины апельсины");
        boxOrange1.add(new Orange());
        boxOrange1.add(new Orange());

        Box<Apple> boxApple1 = new Box<>("Дедушкины яблоки");
        boxApple1.add(new Apple());
        boxApple1.add(new Apple());
        boxApple1.add(new Apple());

        Box<Apple> boxApple2 = new Box<>("Бабушкны яблоки");
        boxApple1.removeTo(boxApple2.getFruits());
        
        // System.out.println(boxOrange1.getWeight());
        System.out.println(boxApple1.getWeight());
        System.out.println(boxApple2.getWeight());

        // System.out.println(boxOrange1.compare(boxApple1));
    }
}
