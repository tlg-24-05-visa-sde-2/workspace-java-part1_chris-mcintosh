package mil.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person person = new Person("Christopher", LocalDate.of(1997, 02, 13));
        System.out.println(person);
        System.out.printf("%s is %s years old\n", person.name(),person.age());

        PersonRecord p2 = new PersonRecord("Pippin", LocalDate.of(2019, 07, 01));
        System.out.printf("%s is %s years old\n", p2.name(), p2.age());
        System.out.println(p2);
    }
}