package ro.fasttrack.lab9hw;

import java.time.LocalDateTime;

/**
 * @author flo
 * @since 20.04.2022.
 */
public interface Person {
    String getFirstname();
    String getLastname();
    String getAddress();
    LocalDateTime getBirthday();
}
