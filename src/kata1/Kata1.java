package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar birth = GregorianCalendar.getInstance();
        birth.set(1998, 11, 13);
        Person person = new Person("Álvaro",birth);
        System.out.println("Nombre: " + person.getName() + ",edad: " + person.getAge() + " años");
    }
}
