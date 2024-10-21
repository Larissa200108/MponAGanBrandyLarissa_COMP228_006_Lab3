package exercise2;
import java.util.Scanner;

//Testing class GameTesterTest
public class GameTesterTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the name of the game tester
        System.out.print("Enter the tester's name: ");
        String name = scanner.nextLine();

        // Ask the user if the tester is full-time or part-time
        System.out.print("Enter 'F' for Full-time or 'P' for Part-time: ");
        char type = scanner.next().charAt(0);

        GameTester tester;  // Declare a GameTester reference

        if (type == 'F' || type == 'f') {
            // Create a FullTimeGameTester object
            tester = new FullTimeGameTester(name);
            System.out.println("Full-time Game Tester entered.");
        } else if (type == 'P' || type == 'p') {
            // Create a PartTimeGameTester object
            System.out.print("Enter the number of hours worked: ");
            int hours = scanner.nextInt();
            tester = new PartTimeGameTester(name, hours);
            System.out.println("Part-time Game Tester entered.");
        } else {
            // Invalid input, default to Full-time
            System.out.println("Invalid input. Default to Full-time.");
            tester = new FullTimeGameTester(name);
        }

        // Display the name of the tester and their salary
        System.out.println("Tester Name: " + tester.getName());
        System.out.println("Salary: $" + tester.determineSalary());

        // Close the scanner
        scanner.close();
    }
}

