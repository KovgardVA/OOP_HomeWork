package Feeding;

public class CatsFeeding {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5);
        Plate plate = new Plate(100);
        
        plate.info();
        cat.eat();
        plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
