abstract class Loan {
    protected int loan_id;
    protected String loan_type;
    protected double amount;
    protected String customer_name;
    public Loan() {
        amount = 0;
    }
    public void setLoanId(int id) {
        loan_id = id;
    }
    public void setCustomerName(String name) {
        customer_name = name;
    }
    public int getLoanId() {
        return loan_id;
    }
    public String getCustomerName() {
        return customer_name;
    }

    public void setAmount(double amt) {
        amount = amt;
    }
    public double getAmount() {
        return amount;
    }
    public abstract String getLoanType();
}