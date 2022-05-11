package ro.fasttrack.lab12.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class Conference {

    private List<Employee> employees;

    public Conference(List<Employee> employees) {
        this.employees = new ArrayList<>(employees);
    }

    public List<Employee> salariesAbove(Integer threshold) {
        List<Employee> result = new ArrayList<>();
        for(Employee e : employees) {
            if(threshold < e.getSalary()) {
                result.add(e);
            }
        }
        return result;
    }

    public int monlthSalaryExpense() {
        int sum = 0;
        for(Employee e : employees) {
            sum += e.getSalary();
        }
        return sum;
    }

    public String mostGenerousCompany() {
        String generousCompany = "";
        int maxSalary = 0;
        for(Employee e : employees) {
            if(e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                generousCompany = e.getCompany();
            }
        }
        return generousCompany;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(this.employees);
    }

    public static void main(String[] args) {
        Conference conference = new Conference(List.of(
                new Employee("ion", 35, "prog", 20, "superC"),
                new Employee("maria", 36, "manag", 15, "superA"),
                new Employee("ionel", 25, "tester", 200, "megaX"),
                new Employee("ionela", 25, "tester", 20, "cucuHapciu")
        ));
        List<Employee> employees = conference.getEmployees();
        Collections.sort(employees, new EmployeeComparator());
        System.out.println(employees);

        List<Employee> employeesCOpy = conference.getEmployees();
        Collections.sort(employeesCOpy,
                new SalaryEmployeeComparator()
                .thenComparing(new NameEmployeeComparator().reversed()));
        System.out.println(employeesCOpy);
    }
}
