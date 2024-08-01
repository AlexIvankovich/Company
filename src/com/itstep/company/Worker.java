package com.itstep.company;

public class Worker extends Employee {

    public Worker(String name, String surname, int workExperience) {
        super(name, surname, workExperience);
    }


    @Override
    public void setProf() {
        this.prof = PROF.WORKER;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Name=" + name +
                "; Surname=" + surname +
                "; Salary=" + printSalary() +
                "; Work Experience=" + workExperience +
                '}';
    }
}
