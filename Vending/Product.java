package Vending;

/*любой класс имеет конструктор, но мы, как разработчики,
имеем право его переопределять. */
public class Product {
    // fields - поля (состояние)
    protected String name;
    protected String brand;
    protected double price;

    /*
     * конструктор - помогает проинициализировать объект
     * определенным состоянием.
     */
    // | сигнатура метода - название + передаваемые параметры |
    public Product(String name, String brand, double price) {
        checkPrice(price);
        checkName(name);
        this.brand = brand; // Указатель на текущий экземпляр объекта. 
    }

    // Перегрузка конструктора.
    public Product(String name, double price) {
        this(name, "NoName", price);
    }

    // Конструктор по-умолчанию.
    public Product() {
        this("Product", 100);
    }

    // методы - поведение
    public String displayInfo() {
        return String.format("%s - %s - %f", brand, name, price);
    }

    // геттер - аксессор
    public double getPrice() {
        return price;
    }

    // сеттер - мьютейтор
    public void setPrice(double price) {
        checkPrice(price);
    }

    private void checkPrice(double price) {
        if (price <= 0) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    private void checkName(String name) {
        if (name.length() < 2) {
            this.name = "Product";
        } else {
            this.name = name;
        }
    }
}