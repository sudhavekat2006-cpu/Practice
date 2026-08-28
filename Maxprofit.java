public class Maxprofit {
    public static int kadanes(int[] arr) {
        if (arr == null || arr.length == 0){
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
        int[] arr = {-2, 3, -1, 4, -5};
        System.out.println(kadanes(arr));
    }
}


