package Fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private String name;
    private ArrayList<T> fruits;

    public Box(String name) {
        this.name = name;
        fruits = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void removeTo(Box<T> newBox) {
        if (this.getWeight() == 0) {
            System.out.println("В коробке ничего нет! Мы не можем из нее ничего переложить.");
        } else {
            newBox.fruits.addAll(fruits);
            this.fruits.clear();
            System.out.printf("Мы переложили %d фруктов из коробки '%s' в коробку '%s'\n",
                    newBox.fruits.size(), name, newBox.getName());
        }
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return String.format("В коробке '%s' лежит %d фруктов.", name, fruits.size());
    }

    public boolean compare(Box<?> compareBox) {
        return this.getWeight() == compareBox.getWeight();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }
}
