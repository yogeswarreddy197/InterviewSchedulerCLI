import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVExporter {
    // Export list to CSV file
    public void exportToCSV(List<Interview> interviews, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Candidate,Date,Time,Interviewer\n");
            for (Interview i : interviews) {
                writer.write(i.toCSV() + "\n");
            }
        } catch (IOException e) {
            System.out.println("❌ Error exporting: " + e.getMessage());
        }
    }
}
