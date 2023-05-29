package Vending;

public class ChocolateBar extends Product {
    private int weight;

    public ChocolateBar(String name, String brand, double price, int weight) {
        super(name, brand, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадный батончик] %s - %s - %f - [%d г.]", brand, name, price, weight);
    }
}
