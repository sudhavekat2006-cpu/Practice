import java.util.*;

public class MinimumPlatform {
    public static int findMinPlatforms(int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // departure times
        int platforms = 0;

        for (int i = 0; i < arrivals.length; i++) {
            // Free up platforms for trains that have already departed
            while (!minHeap.isEmpty() && arrivals[i] >= minHeap.peek()) {
                minHeap.poll();
            }
            // Allocate platform for current train
            minHeap.add(departures[i]);
            platforms = Math.max(platforms, minHeap.size());
        }
        return platforms;
    }

    public static void main(String[] args) {
        int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
        int[] departures = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Minimum platforms required = " +
                findMinPlatforms(arrivals, departures));
    }
}
