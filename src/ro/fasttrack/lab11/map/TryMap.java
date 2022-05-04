package ro.fasttrack.lab11.map;

import ro.fasttrack.lab11.hw.Fruit;

import java.util.HashMap;
import java.util.Map;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class TryMap {
    public static void main(String[] args) {
        Map<String, Fruit> camara = new HashMap<>();
        camara.put("preferate", new Fruit("pere", 2));
        camara.put("proaspete", new Fruit("capsuni", 101));
        camara.put("stricate", new Fruit("banane", 2));

        System.out.println(camara.get("preferate"));
        System.out.println(camara.put("preferate", new Fruit("struguri", 20)));
        System.out.println(camara.get("preferate"));

        camara.putAll(Map.of("stricate", new Fruit("rosi", 5)));
        System.out.println(camara.get("stricate"));

        for (String key : camara.keySet()) {
            System.out.println(key);
        }

        for (Fruit value : camara.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Fruit> stringFruitEntry : camara.entrySet()) {
            System.out.println(stringFruitEntry.getKey() + "->" + stringFruitEntry.getValue());
        }
        System.out.println(camara);
    }
}
