package exercise1;
// Abstract class Insurance
public abstract class Insurance {
    // Type of insurance
    private final String insuranceType;

    // Monthly cost of the insurance
    private double monthlyCost;

    // Constructor to initialize the insurance type
    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    // Getter for the insurance type
    public String getInsuranceType() {
        return insuranceType;
    }

    // Getter for the monthly cost
    public double getMonthlyCost() {
        return monthlyCost;
    }

    // Setter for the monthly cost
    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }
     //Abstract method to set the insurance cost
    public abstract void setInsuranceCost(double cost);

    // Abstract method to display insurance details
    public abstract void displayInfo();
    }
