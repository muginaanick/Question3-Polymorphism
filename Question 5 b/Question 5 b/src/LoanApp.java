public class LoanApp {
    public static void main(String[] args) {
        CarLoan carLoan = new CarLoan();

        carLoan.setLoanId(60008);
        carLoan.setAmount(5000000);
        carLoan.setCustomerName("Mukasa Mbidde");

        carLoan.setCarLien(5000);

        System.out.println("Loan ID: " + carLoan.getLoanId());
        System.out.println("Loan Type: " + carLoan.getLoanType());
        System.out.println("Loan Amount: " + carLoan.getAmount());
        System.out.println("Customer Name: " + carLoan.getCustomerName());
        System.out.println("Car Lien: " + carLoan.getCarLien());
    }
}




