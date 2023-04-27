package Homework6;

public class Wolf extends Animal implements WildAnimal{
    public Wolf(String name) {
        super (name);
    }

    public void greets(){
        System.out.println ("Wolf " + this.getName () + "says: Hawoo!");
    }

    @Override
    public void hunting() {
        System.out.println ("Wolf " + this.getName () + "goes hunting");
    }
}
