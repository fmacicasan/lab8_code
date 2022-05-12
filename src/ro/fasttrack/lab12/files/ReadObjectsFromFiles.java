package ro.fasttrack.lab12.files;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class ReadObjectsFromFiles {
    public static void main(String[] args) throws IOException {
        List<Person> person;
//        person = readPersons("file/person.data");
        person = readPersonWithFiles("file/person.data");
        System.out.println(person);
        writeReport(person);
    }

    private static void writeReport(List<Person> person) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("file/report.txt"))) {
            for (Person p : person) {
                writer.write(personToLine(p));
                writer.newLine();
            }
        }
    }

    private static String personToLine(Person p) {
        return p.getName() + " with age " + p.getAge() + " has position " + p.getPosition();
    }

    private static List<Person> readPersons(String filePath) throws IOException {
        List<Person> results = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line = br.readLine()) != null) {
                results.add(readPersonFromLine(line));
            }
        }
        return results;
    }

    private static List<Person> readPersonWithFiles(String filaPath) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filaPath));
        List<Person> result = new ArrayList<>();
        for (String line : lines) {
            result.add(readPersonFromLine(line));
        }
        return result;
    }

    private static Person readPersonFromLine(String line) {
        //name|age|position
        String[] tokens = line.split(Pattern.quote("|"));

        return new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }
}
