class CarLoan extends Loan {
    private double car_lien;
    public CarLoan() {
        super();
        loan_id = 0;
        customer_name = "";
        amount = 0;
    }
    public void setCarLien(double lien) {
        car_lien = lien;
    }
    public double getCarLien() {
        return car_lien;
    }

    @Override
    public String getLoanType() {
        return "Car Loan";
    }
}
