package Vending;

public class ChocolateBar extends Product {
    private int weight;
    private String chocolateType;

    public ChocolateBar(String name, String brand, double price, int weight, String chocolateType) {
        super(name, brand, price);
        this.weight = weight;
        this.chocolateType = chocolateType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getChocolateType() {
        return chocolateType;
    }
    
    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадный батончик] %s - %s - %f - [%s шоколад - %d г.]", brand, name, price, chocolateType, weight);
    }
}
