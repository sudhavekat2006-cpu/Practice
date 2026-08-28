public class Kadanes { public static int kadanes(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int currentMax = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(kadanes(new int[]{-1, -2, -3, -4, -5}));
    }
}
