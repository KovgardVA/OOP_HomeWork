package Vending;

import java.util.List;

public class VendingMachine {
    // Хранить ссылку на объект класса наследника в переменной супер-типа.
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (((BottleOfWater)product).getVolume() == volume) {
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }
}
