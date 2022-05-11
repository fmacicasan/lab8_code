package ro.fasttrack.lab12.hw;

import java.util.Comparator;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int salaryComparison = o1.getSalary().compareTo(o2.getSalary());
        if(salaryComparison == 0) {
          return o2.getName().compareTo(o1.getName());
        }
        return salaryComparison;
    }
}
