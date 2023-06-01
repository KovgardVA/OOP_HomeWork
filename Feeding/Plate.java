package Feeding;

public class Plate {
    
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("В тарелке %d рыбок.\n", food);
    }

    public boolean isEmpty(int eaten) {
        if (this.food < eaten) return true;
        return false;
    }

    public void addFood(int newFood) {
        this.food += newFood;
    }
}
