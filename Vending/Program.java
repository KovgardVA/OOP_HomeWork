package Vending;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        BottleOfWater bottleOfWater1 = new BottleOfWater("Aqua", "Water co.", 50.99, 0.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Aqua Light", "Water co.", 55.99, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Aqua Max", "Water co.", 59.99, 1.5);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Aqua Zero", "Water co.", 70.99, 1);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Moo", "Cow co.", 62.99, 1.5, 2);
        System.out.println(bottleOfMilk1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterResult != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки нет.");
        }
    }
}
