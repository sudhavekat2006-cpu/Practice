public class Product {
    public static void main(String[] args) {
        int[] prices = {10,20,30,40,50};
        int target = 50;

        int left = 0;
        int right = prices.length - 1;

        while (left < right) {
            int sum = prices[left] + prices[right];

            if (sum == target) {
                System.out.println("Products found: " + prices[left] + " + " + prices[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No two products found with total cost " + target);
    }
}
