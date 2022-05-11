package ro.fasttrack.lab12.hw;

import ro.fasttrack.lab12.files.Person;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class Employee extends Person {

    private final Integer salary;
    private final String company;

    public Employee(String name, int age, String position, int salary, String company) {
        super(name, age, position);
        this.company = company;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", company='" + company + '\'' +
                '}' + super.toString();
    }
}
