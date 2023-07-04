
public class LoanTest {

	public static void main(String[] args) {
		// Create a loan object at 5%, 6 years, $20000
		Loan loan1 = new Loan(5, 6, 20000);
		
		// Display loan date, monthly payment, and total payment
		System.out.println("Loan Date: " + loan1.getLoanDate());
		System.out.printf("Monthly Payment: $%.2f", loan1.getMonthlyPayment());
		System.out.printf("\nTotal Payment: $%.2f", loan1.getTotalPayment());
		
		// Create a default, (no-arg), loan object
		Loan loan2 = new Loan();
		
		// Set the loan amount to 10000
		loan2.setLoanAmount(40000);
		
		// Set the rate to 7.95%
		loan2.setAnnualInterestRate(6.49);
			
		// Set the years to 7 and display again.
		loan2.setNumberOfYears(7);
		
		System.out.println("\n");
		System.out.println("Loan Date: " + loan2.getLoanDate());
		System.out.println("Rate: " + loan2.getAnnualInterestRate());
		System.out.println("Years: " + loan2.getNumberOfYears());
		System.out.printf("Monthly Payment: $%.2f", loan2.getMonthlyPayment());
		System.out.printf("\nTotal Payment: $%.2f", loan2.getTotalPayment());
	}

}
