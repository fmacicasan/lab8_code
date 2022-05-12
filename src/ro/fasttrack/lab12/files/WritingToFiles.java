package ro.fasttrack.lab12.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class WritingToFiles {
    public static void main(String[] args) throws IOException {
        writeOneLine();
        writeWithResources();
        writeWitFiles();
    }

    private static void writeOneLine() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("file/output.txt"));
        writer.write("This is my first file.");
        writer.close();
    }

    private static void writeWithResources() throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("file/outputTry.txt"))) {
            writer.write("This is my first file.");
        }

    }

    private static void writeWitFiles() throws IOException {
        Path path = Path.of("file", "outputFiles.txt");
        Files.write(path, "This is my first file.".getBytes());
        Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "SomeMore".getBytes(), StandardOpenOption.APPEND);
    }
}
