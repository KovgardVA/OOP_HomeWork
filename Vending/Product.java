package Vending;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public Product(String name, String brand, double price) {
        checkPrice(price);
        checkName(name);
        this.brand = brand;
    }

    public Product(String name, double price) {
        this(name, "NoName", price);
    }

    public Product() {
        this("Product", 100);
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }

    public double getPrice() {
        return price;
    }

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