package Homework5;

public class JavaDeveloper extends Employee {

    public JavaDeveloper(String name) {
        super (name);
    }

    @Override
    String getPosition() {
        return "Java Developer";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }

    @Override
    public String getInfo() {
        return super.getInfo () + " is a " + getSeniority () + " " + getPosition ();
    }
}
