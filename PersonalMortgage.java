package exercise3;

//Subclass PersonalMortgage
public class PersonalMortgage extends Mortgage {

    // Constructor to initialize personal mortgage with a 2% higher interest rate than prime
    public PersonalMortgage(String mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        setInterestRate(primeRate);
    }

    @Override
    public void setInterestRate(double primeRate) {
        this.interestRate = primeRate + 2.0;
    }
}



