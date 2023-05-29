package Vending;

/* Если нет конструктора по-умолчанию, обязательно нужно вызывать
 * конструктор базового типа (из наследуемого класса).
 */
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
    
    // public Bottle(String name, double price){
    //     super(name, price); 
    //     /* Указывает на члены базового типа с учетом модификатора
    //      * области видимости.
    //      */
    // }
}
