package ro.fasttrack.lab13.project;

import java.time.LocalDate;

/**
 * @author flo
 * @since 18.05.2022.
 */
public class Item {
    // name,
    private final String name;
    // a description,
    private final String description;
    // an optional expiry date,
    private final LocalDate expiry;
    // the amount that is available in the pantry,
    private int amount;
    // and an optional minimum amount under which I need to restock
    private Integer minimumRestock;

    public Item(String name, LocalDate expiry, int amount, Integer minimumRestock, String description) {
        this.name = name;
        this.description = description;
        this.expiry = expiry;
        this.amount = amount;
        this.minimumRestock = minimumRestock;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public Integer getMinimumRestock() {
        return minimumRestock;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", expiry=" + expiry +
                ", amount=" + amount +
                ", minimumRestock=" + minimumRestock +
                '}';
    }
}
