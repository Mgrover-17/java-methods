import java.util.Scanner;  // Import Scanner class for user input

class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        // Taking input for the three sides of the triangular park
        System.out.println("Enter the three sides of the triangular park:");
        int sideFirst = sc.nextInt();
        int sideSecond = sc.nextInt();
        int sideThird = sc.nextInt();
        
        // Calculate the perimeter of the triangular park
        int perimeter = sideFirst + sideSecond + sideThird;
        
        int distance = 5000;  // Total distance the user needs to run (5km = 5000 meters)
        
        // Calculate and display the number of rounds required to complete 5km
        System.out.println("Number of rounds user needs to do to complete 5km run: " + totalRounds(distance, perimeter));
    }

    // Method to calculate total rounds needed to complete the given distance
    public static int totalRounds(int d, int p) {
        return d / p;  // Number of rounds = Total Distance / Perimeter of the park
    }
}
