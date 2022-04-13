package ro.fasttrack.lab8.code.delivery;

/**
 * @author flo
 * @since 06.04.2022.
 */
public interface Livrator {
    String move(String adresaClient, Food toBeDelivered);
    int estimateDelivery(String adresaClient);
    boolean canKeepFoodSafe(String foodCategory);
}
