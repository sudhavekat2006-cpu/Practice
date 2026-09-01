import java.util.*;

class Job {
    char id;      // Job ID
    int deadline; // Deadline
    int profit;   // Profit

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void findJobSequence(Job[] jobs) {
        int n = jobs.length;

        // Step 1: Sort jobs by profit (descending)
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create result arrays
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        int totalProfit = 0;

        // Step 4: Schedule jobs greedily
        for (Job job : jobs) {
            // Try to find a free slot before deadline
            for (int j = job.deadline - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Print job sequence
        System.out.print("Job sequence: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job('A', 4, 20),
                new Job('B', 1, 10),
                new Job('C', 1, 40),
                new Job('D', 1, 30),
                new Job('E', 3, 30),
                new Job('F', 2, 50)


        };

        findJobSequence(jobs);
    }
}
