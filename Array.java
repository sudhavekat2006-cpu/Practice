public class Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // Calculate sum
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // Calculate average
        double avg_num = (double) sum / arr.length;
        System.out.println("Average: " + avg_num);
    }
}
