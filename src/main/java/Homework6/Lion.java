package Homework6;

public class Lion extends Animal implements WildAnimal{
    public Lion(String name) {
        super (name);
    }

    public void greets(){
        System.out.println ("Lion " + this.getName () + "says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println ("Lion " + this.getName () + "goes hunting");
    }
}
