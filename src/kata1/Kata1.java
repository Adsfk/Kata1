package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        
        Person person = new Person("Álvaro",LocalDate.of(1998, 11, 13));
        System.out.println("Nombre: " + person.getName() + ",edad: " + person.getAge() + " años");
    }
}
