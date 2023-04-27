package Homework4;

public class Animal {
    private String eats;
    private int numberOfLegs;
    private boolean isVegetarian;

    public Animal(){
    }
    public Animal(String eats, int numberOfLegs, boolean isVegetarian) {
        this.eats = eats;
        this.numberOfLegs = numberOfLegs;
        this.isVegetarian = isVegetarian;
    }
    public void printInfo() {
        System.out.println (isVegetarian ? "I am vegetarian" : "I like to eat meat");

        System.out.println ("My favorite meal is " + getEats () + "\nI've got two pairs of legs it's number equals = " + getNumberOfLegs () + "\nI am vegetarian = " + isVegetarian ());
    }
    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.isVegetarian = vegetarian;
    }
}