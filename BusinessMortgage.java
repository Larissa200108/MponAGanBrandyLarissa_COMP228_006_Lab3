package exercise3;

// Subclass BusinessMortgage
public class BusinessMortgage extends Mortgage {

    // Constructor to initialize business mortgage with a 1% higher interest rate than prime
    public BusinessMortgage(String mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        setInterestRate(primeRate);
    }

    @Override
    public void setInterestRate(double primeRate) {
        this.interestRate = primeRate + 1.0;
    }
}
