package com.itstep.company;

import java.util.Arrays;

public class Director extends Employee implements EmployeeSearch {

    private Employee[] employees;

    public Director(String name, String surname, int workExperience) {
        super(name, surname, workExperience);
    }

    public void addWorker(Employee employee){
        if (employees == null){
            employees = new Employee[1];
            employees[0]= employee;
        }else {
            employees = Arrays.copyOf(employees, employees.length+1);
            employees[employees.length-1] = employee;
        }
    }


    @Override
    public void setProf() {
        this.prof = PROF.DIRECTOR;
    }

    @Override
    public int printSalary() {
        if (employees == null) {
            return super.printSalary();
        } else
            return super.printSalary() + (50 * employees.length);
    }

    @Override
    public String toString() {
        return "Director{" +
                "Name=" + name +
                "; Surname=" + surname +
                "; Salary=" + printSalary() +
                "; Work Experience=" + workExperience +
                ", Еmployee position=" + prof +
                "; Employees=" + Arrays.toString(employees) +
                '}';
    }

    @Override
    public void findEmployeeByName(Employee employee, String name) {
        if (employee.getFullName().equals(name)) {
            System.out.println("Работник найден: " + employee.getFullName() + " под управлением " + getFullName());
            return;
        }
         else {
            System.out.println("Работник не найден в подчинении " + getFullName());
        }
     }
}
