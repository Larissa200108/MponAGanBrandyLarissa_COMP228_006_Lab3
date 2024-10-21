package exercise3;
import java.util.Scanner;

// Testing class ProcessMortgage
public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 3 mortgage objects
        Mortgage[] mortgages = new Mortgage[3];

        // Prompt the user for the current prime interest rate
        System.out.print("Enter the current prime interest rate: ");
        double primeRate = scanner.nextDouble();

        // Loop to gather information and create 3 mortgages
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("\nMortgage #" + (i + 1));

            // Prompt for mortgage type
            System.out.print("Enter mortgage type (1 for Business, 2 for Personal): ");
            int type = scanner.nextInt();

            // Prompt for mortgage details
            System.out.print("Enter mortgage number: ");
            String mortgageNumber = scanner.next();
            System.out.print("Enter customer name: ");
            String customerName = scanner.next();
            System.out.print("Enter mortgage amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter term (1, 3, 5 years): ");
            int term = scanner.nextInt();
            // Create the appropriate mortgage based on the type
            if (type == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else if (type == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type. Skipping this mortgage.");
            }
        }
        // Display information for all mortgages
        System.out.println("\nMortgage Details:");
        for (Mortgage mortgage : mortgages) {
            if (mortgage != null) {
                System.out.println(mortgage.getMortgageInfo());
                System.out.println();  // Newline
            }
        }
        // Close the scanner
        scanner.close();
    }
}
