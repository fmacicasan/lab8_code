package ro.fasttrack.lab9hw;

import java.time.LocalDateTime;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class Programmer extends Employee {

    private String language;

    public Programmer(String language, String firstname, String lastname, LocalDateTime birthday, String address, String position, LocalDateTime dateOfEmployment) {
        super(firstname, lastname, birthday, address, position, dateOfEmployment);
        this.language = language;
    }

    @Override
    public String getPosition() {
//        if(super.getPosition().equals("adas")) {
//            return "good programmer";
//        }
        System.out.println("The position from employee superclass is: " + super.getPosition());
        return "programmer";
    }

    public String getLanguage() {
        return this.language;
    }
}
