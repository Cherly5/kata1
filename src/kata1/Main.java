package kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001,04,25);

        Person person = new Person("Echeyde",date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}
