package Vending;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        BottleOfWater bottleOfWater1 = new BottleOfWater("Aqua", "Water co.", 50.99, 0.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Aqua Sparkling", "Water co.", 105.99, 2);

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Moo", "Cow co.", 62.99, 1.5, 2);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);

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
