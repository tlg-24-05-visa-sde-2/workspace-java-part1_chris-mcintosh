package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //Constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        this.setSalary(salary);
    }

    //"action" or business methods
    @Override
    public void pay(){
        System.out.println(getName() + " gets paid " + getSalary() + " every year");
    }

    public void takeVacation(){
        System.out.println(getName() + " is on vacation");
    }

    //Accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + ", salary = " + getSalary();
    }
}