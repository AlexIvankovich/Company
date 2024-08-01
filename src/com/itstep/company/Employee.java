package com.itstep.company;

public abstract class Employee extends Person{

    protected int workExperience;
    protected PROF prof;
    private final int BASIC = 1000;

    public Employee(String name, String surname, int workExperience) {
        super(name, surname);
        this.workExperience = workExperience;
        setProf();
    }



    public int printSalary(){
        return BASIC*prof.getKoef()*workExperience;
    }

    public abstract void setProf();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", surname=" + surname +
                ", prof=" + prof +
                '}';
    }
}