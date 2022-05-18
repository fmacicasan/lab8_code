package ro.fasttrack.lab13.project;

import ro.fasttrack.lab12.files.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

/**
 * @author flo
 * @since 18.05.2022.
 */
public class PantryStorage {
    private static Path STORAGE = Path.of("file", "pantry.txt");

    public Pantry read() {
        return null;
    }

    public void write(Pantry pantry) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(STORAGE.toFile()))) {
            writer.write(String.valueOf(pantry.getCapacity()));
            writer.newLine();
            for (Item i : pantry.getItems()) {
                writer.write(itemToLine(i));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Nu pot scrie in fisier");
        }
    }

    private String itemToLine(Item i) {
        return i.getName() + "|" + i.getDescription() + "|" + i.getAmount() + "|" + i.getExpiry() + "|" + i.getMinimumRestock();
    }
}
