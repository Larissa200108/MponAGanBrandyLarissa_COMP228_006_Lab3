package exercise1;
// Subclass Life
public class Life extends Insurance {

    // Constructor to initialize the Life insurance type
    public Life() {
        super("Life Insurance");
    }
     //Sets the monthly cost of Life insurance
    @Override
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);  // Calls the setter in the parent class to set the cost
    }
     //Displays the details of the Life insurance
    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}
