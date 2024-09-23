package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }

    public void work(double salary){
        System.out.println("Junior Developer starts to working");
        setSalary(salary);
    }
}
