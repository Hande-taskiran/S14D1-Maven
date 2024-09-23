package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }
    public void work(double salary){
        System.out.println("Mid Developer starts to working");
        setSalary(salary);
    }
}
