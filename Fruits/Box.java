package Fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    
    private String name;
    private ArrayList<T> fruits;
    private float weight;

    public Box(String name) {
        this.name = name;
        fruits = new ArrayList<T>();
        weight = 0.0f;
    }

    public String getName() {
        return name;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void removeTo(ArrayList<T> newBox) {
        newBox.addAll(fruits);
        fruits.clear();
    }

    public float getWeight() {
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box [name=" + name + ", fruits=" + fruits.size() + "]";
    }

    public boolean compare(Box<?> compareBox) {
        return this.getWeight() == compareBox.getWeight();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }
}
