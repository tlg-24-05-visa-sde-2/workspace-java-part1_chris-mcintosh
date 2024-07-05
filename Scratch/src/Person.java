/*
 * An immutable class.
 * That is, a class definition written in such a way that instance of it (Person objects),
 * once created, cannot have their properties changed.
 * There are simply no public methods to do so, i.e., getters, but No setters.
 */

import java.time.LocalDate;

class Person {
    private final String name;
    private final LocalDate birthDate;


    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * This it the period of time between the birthday and today's date.
     * This is a derived
     */

    public int currentAge() {
        int age = LocalDate.now().getYear() - birthDate.getYear();
        return age;
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString(){
        return String.format("Person = Name: %s, Birth Date: %s", name(), birthDate());
    }
}