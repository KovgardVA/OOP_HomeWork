package Vending;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        BottleOfWater bottleOfWater1 = new BottleOfWater("Aqua", "Water co.", 50.99, 0.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Aqua Sparkling", "Water co.", 105.99, 2);

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Moo", "Cow co.", 62.99, 1.5, 2);

        ChocolateBar chocolateBar1 = new ChocolateBar("Snickers Super", "Mars co.", 88.99, 80, "Молочный");
        ChocolateBar chocolateBar2 = new ChocolateBar("Twix White", "Mars co.", 46.99, 42, "Белый");
        ChocolateBar chocolateBar3 = new ChocolateBar("Snickers Dark", "Mars co.", 52.99, 50, "Темный");

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
