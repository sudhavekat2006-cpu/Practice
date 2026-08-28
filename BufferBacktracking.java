public class BufferBacktracking {
    static String[] food = {"A", "B", "C", "D"};
    static int[] calories = {10, 30, 40, 20};
    static int caloriesLimit = 20;

    public static void combineFoodCalories(int index, String currentPlate, int currentCalories) {
        // Base case: if calories exceed limit, stop
        if (currentCalories > caloriesLimit) {
            return;
        }

        // Print valid combination
        if (!currentPlate.isEmpty()) {
            System.out.println(currentPlate +  " Total " + currentCalories + " calories");
        }

        // Recursive case: try adding more food items
        for (int i = index; i < food.length; i++) {
            combineFoodCalories(i + 1, currentPlate + food[i], currentCalories + calories[i]);
        }
    }

    public static void main(String[] args) {
        combineFoodCalories(0, "", 0);
    }
}
