package ro.fasttrack.lab12.hw;

import ro.fasttrack.lab12.files.Person;

import java.util.*;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class Recensamant {
    public static void main(String[] args) {
        List<Person> populatie = new ArrayList<>();
        populatie.add(new Person("George", 13, "elev"));
        populatie.add(new Person("George", 35, "programator"));
        populatie.add(new Person("Georgeta", 34, "programator"));

        Map<String, Integer> nameToAge = new HashMap<>();
        for(Person person : populatie) {
            nameToAge.put(person.getName(), person.getAge());
            System.out.println(nameToAge);
        }

        Collections.sort(populatie, new PersonComparatorOnLastChar());
        System.out.println(populatie);
    }
}
