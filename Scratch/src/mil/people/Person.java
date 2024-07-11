package mil.people;
import java.time.LocalDate;
import java.time.Period;
/*
 * An immutable class.
 * That is, a class definition written in such a way that instance of it (Person objects),
 * once created, cannot have their properties changed.
 * There are simply no public methods to do so, i.e., getters, but No setters.
 */

class Person {
    private final String name;
    private final LocalDate birthDate;


    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * This it the period of time between th
     * e birthday and today's date.
     * This is a derived
     */

    public int age() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    @Override
    public String toString(){
        return String.format("%s: Name= %s, Birth Date= %s",
                getClass().getSimpleName(), name(), birthDate());
    }
}