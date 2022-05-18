package ro.fasttrack.lab13.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author flo
 * @since 18.05.2022.
 */
public class ReportGenerator {
    public void generateReport(Classroom classrom) throws IOException {
        Path path = Path.of("file", "grades-report.out");
        StudentGrade maxGrade = classrom.getMaxGrade();
        String maxReport = "Largest Grade: " + maxGrade.getName() + " " + maxGrade.getGrade();
        Files.write(path, maxReport.getBytes());
        Files.write(path,"\nAverage Grade: ".getBytes(), StandardOpenOption.APPEND);
    }
}
