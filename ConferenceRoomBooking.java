import java.util.*;

class Meeting {
    String team;
    int start;
    int end;

    Meeting(String team, int start, int end) {
        this.team = team;
        this.start = start;
        this.end = end;

    }

}

public class ConferenceRoomBooking {
    public static void main(String[] args) {
        // Example: 4 teams with requested meeting times
        List<Meeting> meetings = Arrays.asList(
                new Meeting("Team A", 9, 10),
                new Meeting("Team B", 9, 11),
                new Meeting("Team C", 10, 11),
                new Meeting("Team D", 11, 12)
        );

        // Step 1: Sort meetings by end time (greedy choice)
        meetings.sort((a, b) -> a.end - b.end);

        // Step 2: Schedule meetings
        List<Meeting> scheduled = new ArrayList<>();
        int lastEnd = -1;

        for (Meeting m : meetings) {
            if (m.start >= lastEnd) {
                scheduled.add(m);
                lastEnd = m.end;
            }
        }

        // Step 3: Print schedule
        System.out.println("Scheduled Meetings:");
        for (Meeting m : scheduled) {
            System.out.println(m.team + " meeting from " + m.start + " to " + m.end);
        }
    }
}
