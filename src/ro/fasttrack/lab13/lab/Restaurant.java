package ro.fasttrack.lab13.lab;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 18.05.2022.
 */
public class Restaurant {
    private String name;
    private String city;
    private RestaurantType type;
    private int rating;

    public Restaurant(String name, String city, RestaurantType type, int rating) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.rating = rating;
    }

    public RestaurantType getType() {
        return type;
    }

    public static List<Restaurant> allRestaurantsOfType(RestaurantType type, List<Restaurant> restaurants) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if(restaurant.getType() == type) {
                result.add(restaurant);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Damper", "Cluj", RestaurantType.MEDITERANEEAN, 3));
        restaurants.add(new Restaurant("Cucul Batran", "Drobeta", RestaurantType.ROMANIAN, 5));
        restaurants.add(new Restaurant("Zimbrul Inalt", "Gheorghieni", RestaurantType.GREEK, 3));
        restaurants.add(new Restaurant("Fuziunea Papilelor", "Bucuresti", RestaurantType.FUSION, 1));
        restaurants.add(new Restaurant("Feta pasta", "Bucuresti", RestaurantType.GREEK, 1));

        System.out.println(allRestaurantsOfType(RestaurantType.GREEK, restaurants));

    }
}
