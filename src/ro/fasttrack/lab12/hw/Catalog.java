package ro.fasttrack.lab12.hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author flo
 * @since 11.05.2022.
 */
public class Catalog {

    public static void main(String[] args) {
        Map<String, Integer> catalog = new HashMap<>();
        catalog.put("Ion", 9);
        catalog.put("Maria", 10);
        catalog.put("marian george Usa", 9);

        System.out.println(catalog.values());
        System.out.println(catalog.values().getClass());
        System.out.println(new HashSet<>(catalog.values()));

        System.out.println(getFirstLetterInCatalog(catalog));

    }

    public static Set<Character> getFirstLetterInCatalog(Map<String,Integer> catalog) {
        Set<Character> result = new HashSet<>();
        for(String name : catalog.keySet()) {
            result.add(name.charAt(0));
        }
        return result;
    }
}
