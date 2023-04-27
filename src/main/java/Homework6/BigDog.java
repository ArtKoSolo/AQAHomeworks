package Homework6;

public class BigDog extends Dog {

    public BigDog(String name) {
        super (name);
    }

    @Override
    public void greets() {
        System.out.println ("Woow");
    }

    @Override
    public void greets(String anotherDog) {
        System.out.println ("Wooooow");
    }

    public void greets(String anotherBigDog, String huge){
        System.out.println ("Woooooooooow");
    }

}
