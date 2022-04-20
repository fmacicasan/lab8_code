package ro.fasttrack.lab9hw;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class Programmer extends Employee {

    private String language;

    public Programmer(String language, String firstname) {
        super(firstname);
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
