package com.hr.personnel;

import gov.irs.TaxPayer;

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

    //"action" or business methods
    @Override
    public void pay(){
        double payment = getRate() * getHours();
        System.out.println(getName() + " gets paid " + payment + " every week" );
    }

    @Override
    public void payTaxes() {
        double taxes = getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes + " every two weeks" );
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
        return super.toString() +
                ", Rate: " + getRate()
                + ", Hours: " + getHours();
    }
}