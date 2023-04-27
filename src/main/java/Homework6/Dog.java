package Homework6;

public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super (name);
    }

    public void greets(){
        System.out.println ("Dog " + this.getName () + "says:Woof");
    }

    public void greets(String anotherDog){
        System.out.println ("Wooooof");
    }

    @Override
    public void play() {
        System.out.println ("Playing with dog " + this.getName ());
    }

    @Override
    public void walk() {
        System.out.println ("Walking with the dog " + this.getName ());
    }

    @Override
    public void feed() {
        System.out.println ("Feeding th dog " + this.getName ());
    }
}
