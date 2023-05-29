package Vending;

public class BottleOfWater extends Product {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f - [Объем: %f]", brand, name, price, volume);
    }
}
