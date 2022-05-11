package ro.fasttrack.lab12.hw;

import java.util.Comparator;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class SalaryEmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
