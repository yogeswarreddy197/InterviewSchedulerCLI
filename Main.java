import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InterviewScheduler scheduler = new InterviewScheduler();
        CSVExporter exporter = new CSVExporter();

        boolean exit = false;

        System.out.println("=== Interview Scheduler CLI ===");
        while (!exit) {
            System.out.println("\n1. Add Interview");
            System.out.println("2. View All Interviews");
            System.out.println("3. Export to CSV");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter candidate name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Enter time (HH:MM): ");
                    String time = sc.nextLine();
                    System.out.print("Enter interviewer: ");
                    String interviewer = sc.nextLine();

                    Interview interview = new Interview(name, date, time, interviewer);
                    boolean added = scheduler.addInterview(interview);
                    if (added) {
                        System.out.println("✅ Interview scheduled successfully!");
                    } else {
                        System.out.println("⚠️ Conflict! Another interview exists at same time.");
                    }
                    break;

                case "2":
                    scheduler.viewAll();
                    break;

                case "3":
                    exporter.exportToCSV(scheduler.getInterviews(), "interviews.csv");
                    System.out.println("📄 Exported to interviews.csv");
                    break;

                case "4":
                    exit = true;
                    System.out.println("Goodbye 👋");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
            }
        }
        sc.close();
    }
}
