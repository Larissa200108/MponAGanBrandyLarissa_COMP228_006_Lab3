package exercise2;
// Subclass FullTimeGameTester
public class FullTimeGameTester extends GameTester {

    // Constructor to initialize the name and set fullTime to true
    public FullTimeGameTester(String name) {
        super(name, true);  // Full-time status is always true for this class
    }
     //Full-time testers receive a base salary of $3000.
    @Override
    public double determineSalary() {
        return 3000.0;  // Base salary for full-time game testers
    }
}


