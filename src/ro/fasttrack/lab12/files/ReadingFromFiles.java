package ro.fasttrack.lab12.files;

import java.io.*;
import java.util.Scanner;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {
        readOneLine();
        readFullFile();
        readFileBuffered();
    }

    private static void readFileBuffered() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("file/content.txt"));

        String line;
        while((line = fileReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void readFullFile() throws FileNotFoundException {
        System.out.println("----full file---");
        Scanner scanner = new Scanner(new File("file", "content.txt"));
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    private static void readOneLine() throws FileNotFoundException {
//        new Scanner(System.in)
        Scanner scanner = new Scanner(new File("file", "content.txt"));
        System.out.println(scanner.nextLine());

    }
}
