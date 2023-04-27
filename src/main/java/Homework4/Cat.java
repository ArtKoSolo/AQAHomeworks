package Homework4;

public class Cat extends Animal {
    private String color = "white";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String eats, int numberOfLegs, boolean isVegetarian, String color) {
        super (eats, numberOfLegs, isVegetarian);
        this.color = color;
    }
    public Cat(String eats, int numberOfLegs, boolean isVegetarian) {
        super (eats, numberOfLegs, isVegetarian);
    }

    public void printInfo(){
        System.out.println ("My color is " + getColor ());
    }
}
