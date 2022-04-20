package ro.fasttrack.lab9hw;

import java.time.LocalDateTime;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class Employee implements  Person {
    private String firstname;
    private String lastname;
    private String address;
    private LocalDateTime birthday;

    private String position;
    private LocalDateTime dateOfEmployment;

    public Employee(String firstname, String lastname, LocalDateTime birthday,
                    String address,
                    String position, LocalDateTime dateOfEmployment
                    ) {
        this.firstname = firstname;
    }

    public Employee(String firstname) {
        this.firstname = firstname;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }
}
