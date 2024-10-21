package exercise1;
import java.util.Scanner;

// Testing class InsuranceTest
public class InsuranceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array to store two Insurance objects
        Insurance[] insurances = new Insurance[2];

        // Loop twice to create and set insurance for Health and Life
        for (int i = 0; i < insurances.length; i++) {
            // Ask user to input the type of insurance
            System.out.print("Enter the type of insurance (Health/Life): ");
            String type = scanner.nextLine();

            // Create an object based on user input
            if (type.equalsIgnoreCase("Health")) {
                insurances[i] = new Health();  // Create Health insurance
            } else if (type.equalsIgnoreCase("Life")) {
                insurances[i] = new Life();    // Create Life insurance
            } else {
                System.out.println("Invalid insurance type.Health as a default.");
                insurances[i] = new Health();  // Default to Health if invalid input
            }
            // Ask for the monthly cost and set it for the created insurance object
            System.out.print("Enter the monthly cost for " + type + " insurance: ");
            double cost = scanner.nextDouble();
            scanner.nextLine();

            // Call the setInsuranceCost method to set the cost
            insurances[i].setInsuranceCost(cost);
        }
        // Display information for all insurances(Polymorphic)
        System.out.println("\nInsurance Details:");
        for (Insurance insurance : insurances) {
            insurance.displayInfo();  // Calls the displayInfo method for each insurance
            System.out.println();  // Print a new line between entries
        }
        // Close the scanner
        scanner.close();
    }
}


