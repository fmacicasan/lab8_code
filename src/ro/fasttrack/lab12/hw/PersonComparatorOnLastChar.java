package ro.fasttrack.lab12.hw;

import ro.fasttrack.lab12.files.Person;

import java.util.Comparator;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class PersonComparatorOnLastChar implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Character.compare(
                o1.getName().charAt(o1.getName().length() - 1),
                o2.getName().charAt(o2.getName().length() - 1)
        );
    }
}
