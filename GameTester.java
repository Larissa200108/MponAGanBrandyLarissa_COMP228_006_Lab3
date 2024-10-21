package exercise2;
// Abstract class GameTester
public abstract class GameTester {
    private final String name;      // Name of the game tester
    private final boolean fullTime; // Employment status (true if full-time, false if part-time)

    // Constructor to initialize name and employment status
    public GameTester(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for fullTime status
    public boolean isFullTime() {
        return fullTime;
    }
     //Abstract method to determine the salary
    public abstract double determineSalary();
}
