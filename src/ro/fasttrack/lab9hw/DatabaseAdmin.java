package ro.fasttrack.lab9hw;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class DatabaseAdmin extends Employee {

    private String dbTechnology;

    public DatabaseAdmin(String firstname) {
        super(firstname);
    }

    @Override
    public String getAddress() {
        return "db admin" + super.getAddress();
    }
}
