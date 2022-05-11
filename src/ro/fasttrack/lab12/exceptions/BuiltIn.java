package ro.fasttrack.lab12.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class BuiltIn {
    public static void main(String[] args) {

        System.out.println("Inainte de exceptie");
        try {
            List<String> elems = new ArrayList<>();
            elems.add("asd");
            elems.add("asdf");
            elems.get(1);
            String abc = "null";
            abc.toLowerCase();
            if(elems.size() > 100) {
                handleLargeElements();
            }
            if(elems.size() < 3) {
                handleTooSmallElements();
            }
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Am scapat de un index out of bounds sau IllegalArgument exception.");
        } catch (NullPointerException e) {
            System.out.println("Am scapat de un NPE");
//        } catch(MyCustomException e) {

        } finally {
            System.out.println("Asta voi printa de fiecare data.");
        }

        System.out.println("Dupa exceptie");

    }

    private static void handleTooSmallElements()  {
        try {
            throw new MyCustomException();
        } catch (MyCustomException e) {
            System.out.println("Am prins my custom exception");
        }
    }

    private static void handleLargeElements() {
        throw new IllegalArgumentException();
    }
}
