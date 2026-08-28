public class Ascending {
    public static void main(String[] args) {
        int[] arr = {50,10,20,30,40};

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted in ascending order.");
        }
    }
}

