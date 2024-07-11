package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {



    //Constructors that were generated
    public Executive() {
        super(); //Always a call to super whether you can see it or not
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    //Business methods

    @Override
    public void work() {
        System.out.println(getName() + " Playing golf since " + getHireDate());
    }
}