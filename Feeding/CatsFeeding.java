package Feeding;

public class CatsFeeding {
    public static void main(String[] args) {

        Cat[] cats = {
            new Cat("Барсик", 5),
            new Cat("Персик", 7),
            new Cat("Пискус", 8),
            new Cat("Буся", 3),
            new Cat("Толик", 6)
        };

        Plate plate = new Plate(20);
        plate.addFood(5);
        plate.info();

        for (Cat cat : cats) {
            if (plate.isEmpty(plate.getFood(), cat.getAppetite())) {
                continue;
            } else {
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
        }

        for (Cat cat : cats) {
            if (cat.isHungry()) {
                System.out.printf("Котик %s остался голодным.\n", cat.getName());
            } else {
                System.out.printf("Котик %s съел все %s рыбок.\n", cat.getName(), cat.getAppetite());
            }
        }

    }
}
