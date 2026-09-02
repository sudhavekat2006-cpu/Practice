import java.util.Scanner;

public class EvenNoInArray{

    // Method to print even numbers
    public static void printEvenNumbers(int[] arr) {
        System.out.println("Even numbers in the array:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Method to print odd numbers
    public static void printOddNumbers(int[] arr) {
        System.out.println("Odd numbers in the array:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print even and odd numbers
        printEvenNumbers(arr);
        printOddNumbers(arr);

        sc.close();
    }
}
