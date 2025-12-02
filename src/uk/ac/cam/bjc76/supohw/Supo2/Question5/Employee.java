package uk.ac.cam.bjc76.supohw.Supo2.Question5;

public class Employee {
    int salary;
    String name;
    int level;
    int workingHours;

    public Employee(String name, int salary, int level, int workingHours) {
        this.name = name;
        this.salary = salary;
        this.level = level;
        this.workingHours = workingHours;
    }

    public void changeWorkingHours(int newWorkingHours) {
        this.workingHours = newWorkingHours;
    }

    public double calculateHourlyWage() {
        return (double) salary / (double) workingHours;
    }

}
