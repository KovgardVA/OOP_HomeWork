package Fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    
    private String name;
    private List<T> fruits;
    private float weight;

    public Box(String name) {
        this.name = name;
        fruits = new ArrayList<>();
        weight = 0.0f;
    }

    public String getName() {
        return name;
    }

    public void add(T fruit) {
        fruits.add(fruit);
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
}
