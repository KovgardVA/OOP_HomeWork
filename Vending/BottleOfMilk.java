package Vending;

public class BottleOfMilk extends Product {
    private double volume;
    private int fatContent;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public BottleOfMilk(String name, String brand, double price, double volume, int fatContent) {
        super(name, brand, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f - [Объем: %f; жирность: %d]", brand, name, price, volume, fatContent);
    }
}