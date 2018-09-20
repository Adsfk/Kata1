package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Alvaro",new Date(98,10,13));
        System.out.println("Nombre: " + person.getName() + ",edad: " + person.getAge());
    }
    
}
