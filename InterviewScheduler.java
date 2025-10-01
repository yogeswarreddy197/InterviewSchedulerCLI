import java.util.ArrayList;
import java.util.List;

public class InterviewScheduler {
    private List<Interview> interviews = new ArrayList<>();

    // Add new interview, check conflicts
    public boolean addInterview(Interview newInterview) {
        for (Interview i : interviews) {
            if (i.getDate().equals(newInterview.getDate()) && i.getTime().equals(newInterview.getTime())) {
                return false; // conflict found
            }
        }
        interviews.add(newInterview);
        return true;
    }

    // View all scheduled interviews
    public void viewAll() {
        if (interviews.isEmpty()) {
            System.out.println("📭 No interviews scheduled yet.");
            return;
        }
        System.out.println("\n📅 Scheduled Interviews:");
        for (Interview i : interviews) {
            System.out.println(i);
        }
    }

    // Return all interviews
    public List<Interview> getInterviews() {
        return interviews;
    }
}
