package ro.fasttrack.lab9hw;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class Company {
    public static void main(String[] args) {
        Programmer ion = new Programmer("java", "ion");
        System.out.println(ion.getLanguage());
        System.out.println(ion.getPosition());
        System.out.println(ion.getFirstname());

        Employee gheorghe = new DatabaseAdmin("gheorghe");
        Object gObs = gheorghe;
        System.out.println(gheorghe.getAddress());
        Employee ionE = ion;
//        gheorghe = ion;
        DatabaseAdmin altaVariabila = (DatabaseAdmin) gheorghe;
        System.out.println(gheorghe.getAddress());
        System.out.println(altaVariabila.getAddress());
    }
}
