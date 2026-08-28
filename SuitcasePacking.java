public class SuitcasePacking {
    static String[] items = {"Shoes", "Laptop", "Book", "Jacket"};
    static int[] weights = {3, 7, 2, 5};
    static int maxWeight = 10;

    public static void packSuitcase(int index, String currentItems, int currentWeight) {
        if (currentWeight > maxWeight) {
            return;
        }

        // Print valid combination (only if not empty)
        if (!currentItems.isEmpty()) {
            System.out.println(currentItems.trim());
        }

        // Backtracking step: try adding each remaining item
        for (int i = index; i < items.length; i++) {
            packSuitcase(i + 1,
                    currentItems + items[i] + " ",
                    currentWeight + weights[i]);
        }
    }

    public static void main(String[] args) {
        packSuitcase(0, "", 0);
    }
}

