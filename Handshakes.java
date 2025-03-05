import java.util.Scanner;  // Import Scanner class for user input

class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // Read number of students from the user
        System.out.println("Enter number:");
        int number = sc.nextInt();   

        // Calculate maximum number of handshakes using the maxHandshakes method and print the result
        System.out.println("Max number of handshakes is/are " + maxHandshakes(number));
    }

    // Method to calculate maximum number of handshakes using the formula: (n*(n-1)) / 2
    public static int maxHandshakes(int n) {
        return (n*(n-1)) / 2;
    }
}
