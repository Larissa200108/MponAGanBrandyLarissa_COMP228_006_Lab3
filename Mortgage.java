package exercise3;

// Abstract class Mortgage
//Implements the MortgageConstants interface and includes basic mortgage details.
public abstract class Mortgage implements MortgageConstants {
    private final String mortgageNumber;
    private final String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    private int term;

    // Constructor to initialize mortgage details
    public Mortgage(String mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        setMortgageAmount(mortgageAmount);
        setTerm(term);
    }

    // Setter for mortgage amount, maxed at $300,000
    public void setMortgageAmount(double mortgageAmount) {
        if (mortgageAmount > MAX_MORTGAGE_AMOUNT) {
            System.out.println("Mortgage amount exceeds the maximum limit of $300,000. Setting to maximum.");
            this.mortgageAmount = MAX_MORTGAGE_AMOUNT;
        } else {
            this.mortgageAmount = mortgageAmount;
        }
    }

    // Setter for term, defaults to SHORT_TERM if invalid
    public void setTerm(int term) {
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            System.out.println("Invalid term. Defaulting to SHORT TERM loan.");
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    // Method to calculate the total amount owed
    public double calculateTotalOwed() {
        double totalInterest = mortgageAmount * (interestRate / 100) * term;
        return mortgageAmount + totalInterest;
    }

    // Abstract method for setting the interest rate, to be implemented by subclasses
    public abstract void setInterestRate(double primeRate);

    // Method to display mortgage information
    public String getMortgageInfo() {
        return  "Bank:"+ BANK_NAME +
                "\nMortgage Number: " + mortgageNumber +
                "\nCustomer Name: " + customerName +
                "\nMortgage Amount: $" + mortgageAmount +
                "\nInterest Rate: " + interestRate + "%" +
                "\nTerm: " + term + " years" +
                "\nTotal Amount Owed: $" + calculateTotalOwed();
    }
}



