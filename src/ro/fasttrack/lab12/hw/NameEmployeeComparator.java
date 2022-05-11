package ro.fasttrack.lab12.hw;

import java.util.Comparator;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class NameEmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
