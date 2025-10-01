public class Interview {
    private String candidateName;
    private String date;
    private String time;
    private String interviewer;

    // Constructor
    public Interview(String candidateName, String date, String time, String interviewer) {
        this.candidateName = candidateName;
        this.date = date;
        this.time = time;
        this.interviewer = interviewer;
    }

    // Getters
    public String getDate() { return date; }
    public String getTime() { return time; }

    // Convert to CSV format
    public String toCSV() {
        return candidateName + "," + date + "," + time + "," + interviewer;
    }

    // Print format
    @Override
    public String toString() {
        return "Candidate: " + candidateName + " | Date: " + date + " | Time: " + time + " | Interviewer: " + interviewer;
    }
}
