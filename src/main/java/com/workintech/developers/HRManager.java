package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 4000);
    }

    public void addEmployee(JuniorDeveloper developer, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("This index is already full");
            return;
        }
        juniorDevelopers[index] = developer;
    }

    public void addEmployee(MidDeveloper developer, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("This index is already full");
            return;
        }
        midDevelopers[index] = developer;
    }

    public void addEmployee(SeniorDeveloper developer, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("This index is already full");
            return;
        }
        seniorDevelopers[index] = developer;
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public void setJuniorDevelopers(JuniorDeveloper[] juniorDevelopers) {
        this.juniorDevelopers = juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public void setMidDevelopers(MidDeveloper[] midDevelopers) {
        this.midDevelopers = midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void setSeniorDevelopers(SeniorDeveloper[] seniorDevelopers) {
        this.seniorDevelopers = seniorDevelopers;
    }
}