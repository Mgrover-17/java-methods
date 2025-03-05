import java.util.Scanner;  // Import Scanner class for user input
import java.lang.Math;  // Import Math class for max() and min() functions

class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object to take input from the user

        // Prompt user to enter three numbers
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Call the function to find the smallest and largest numbers
        int ans[] = findSmallestAndLargest(num1, num2, num3);

        // Display the results
        System.out.println("Largest number is: " + ans[0]);
        System.out.println("Smallest number is: " + ans[1]);
    }

    // Method to find the smallest and largest numbers among three given numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int result[] = new int[2];  // Array to store largest and smallest values

        // Find the largest number using Math.max()
        int maxElement = Math.max(number1, Math.max(number2, number3));

        // Find the smallest number using Math.min()
        int minElement = Math.min(number1, Math.min(number2, number3));

        // Store values in the result array
        result[0] = maxElement;  // Largest number
        result[1] = minElement;  // Smallest number

        return result;  // Return the array containing largest and smallest numbers
    }
}
