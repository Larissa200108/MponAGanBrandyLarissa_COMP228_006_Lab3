package exercise2;
// Subclass PartTimeGameTester
public class PartTimeGameTester extends GameTester {
    private final int hoursWorked;  // Number of hours worked by the part-time tester

    // Constructor to initialize name, part-time status, and hours worked
    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);   // Part-time status is always false for this class
        this.hoursWorked = hoursWorked;
    }
     //Determines the salary for a part-time game tester, noting that Part-time testers earn $20 per hour
    @Override
    public double determineSalary() {
        return hoursWorked * 20.0;  // $20 per hour
    }
}

