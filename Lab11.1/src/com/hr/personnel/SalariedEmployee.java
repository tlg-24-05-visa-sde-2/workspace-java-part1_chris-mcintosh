package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //fields
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

    @Override
    public void payTaxes() {
       double taxes =  getSalary()  * TaxPayer.SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes + " every year");
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