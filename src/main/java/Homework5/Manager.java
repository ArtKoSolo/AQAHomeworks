package Homework5;

import java.util.Arrays;

public class Manager extends Employee {
    final String lastName;

    String [] teamMembers = {"Tom", "Bill", "Misha", "John"};
    String employeeTeam = Arrays.toString (teamMembers);

    public Manager(String name, String lastName) {
        super (name);
        this.lastName = lastName;
    }

    @Override
    String getPosition() {
        return "Manager";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }

    @Override
    public String getLastName() {
        return super.getLastName ();
    }

    @Override
    public String getInfo() {
        return super.getInfo () + " " + getLastName () + " is a " + getSeniority () + " " + getPosition () + " and has a team of 4 members: " + employeeTeam;
    }

    public void setTeamMembers(JavaDeveloper javaDev, AngularDeveloper angularDev, AutomationEngineer autoTester, ManualTestEngineer manualTester) {
    }
}
