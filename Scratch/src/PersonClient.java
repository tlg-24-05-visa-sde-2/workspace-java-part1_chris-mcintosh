import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person person = new Person("Christopher", LocalDate.of(1997, 02, 13));
        System.out.println(person);
        System.out.printf("%s is %s years old", person.name(),person.currentAge());
    }
}