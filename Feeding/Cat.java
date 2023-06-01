package Feeding;

public class Cat {

    private String name;
    private int appetite;
    private boolean hunger;
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = true;
    }

    public boolean isHungry() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat() {
        if (this.hunger) this.hunger = false;
    }
}
