package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary){
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }
    public void work(double salary){
        System.out.println("HRManager starts to working");
        setSalary(salary);
    }
    public void addEmployee(JuniorDeveloper junior) {
        addDeveloperToTeam(juniorDevelopers, junior);
    }

    public void addEmployee(MidDeveloper mid) {
        addDeveloperToTeam(midDevelopers, mid);
    }

    public void addEmployee(SeniorDeveloper senior) {
        addDeveloperToTeam(seniorDevelopers, senior);
    }

    private void addDeveloperToTeam(Employee[] developers, Employee newEmployee) {
        for (int i = 0; i < developers.length; i++) {
            if (developers[i] == null) {
                developers[i] = newEmployee;
                System.out.println(newEmployee.getName() + " added to the team.");
                return;
            }
        }
        System.out.println("No space available to add " + newEmployee.getName() + " to the team.");
    }
}
