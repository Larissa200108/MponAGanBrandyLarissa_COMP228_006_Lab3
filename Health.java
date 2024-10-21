package exercise1;
//Subclass Health
public class Health extends Insurance {

    // Constructor to initialize the Health insurance type
    public Health() {
        super("Health Insurance");
    }
     // Sets the monthly cost of Health insurance
    @Override
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);  // Calls the setter in the parent class to set the cost
    }
     // Displays the details of the Health insurance
    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}

