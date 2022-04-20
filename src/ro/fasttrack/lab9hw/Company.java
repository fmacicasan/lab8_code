package ro.fasttrack.lab9hw;

import java.time.LocalDateTime;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class Company {
    public static void main(String[] args) {
        Programmer ion = new Programmer("java", "ion", "cuc",
                LocalDateTime.parse("1943-04-20T10:14:14"), "plevnei 25", "advanced", LocalDateTime.of(2022, 4, 19, 10, 15, 12));
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
