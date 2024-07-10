package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        this.setRate(rate);
        this.setHours(hours);
    }

    //Accessor Methods
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()
                + "Rate: " + getRate()
                + "\nHours: " + getHours()
                + "\nEmployee Name: " + getName()
                + "\nEmployee Date: " + getHireDate();
    }
}