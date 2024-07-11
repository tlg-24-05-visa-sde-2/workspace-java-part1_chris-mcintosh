/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1250.0));
        dept.addEmployee(new HourlyEmployee("Julie",   LocalDate.of(2000, 2, 2), 50.00, 40.00));
        dept.addEmployee(new SalariedEmployee("Mac",   LocalDate.of(2020, 2, 13), 70000.00));
        dept.addEmployee(new HourlyEmployee("Chris",   LocalDate.of(1997, 06, 05 ), 30.00, 40.00));
        dept.addEmployee(new Executive("Beau",         LocalDate.of(2020, 8,8 ), 2_000_000 ));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //Employees getting paid
        System.out.println("\nPay all employees");
        dept.payEmployees();

        //force Holiday Break
        System.out.println("\nHoliday break:");
        dept.HolidayBreak();
    }
}