package Homework6;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat ("Tommy ");
        cat.walk ();
        cat.play ();
        cat.greets ();
        cat.feed ();


        Dog dog = new Dog ("Filly ");
        dog.greets ();
        dog.greets ("Puppy ");
        dog.feed ();
        dog.walk ();
        dog.play ();

        BigDog bigDog = new BigDog ("Lucy ");
        bigDog.greets ();
        bigDog.greets ("Timmy ");
        bigDog.greets ("Fluffy ","giant");

        Lion lion = new Lion ("Simba ");
        lion.hunting ();
        lion.greets ();

        Wolf wolf = new Wolf ("Chucky ");
        wolf.hunting ();
        wolf.greets ();

    }

}
