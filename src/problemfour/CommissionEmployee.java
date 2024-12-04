package problemfour;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String toString() {
        return  "Commission Employee --> \n" +
                "First name = " + getFirstName() + "\n" +
                "Last name = " + getLastName() + "\n" +
                "SSN = " + getSocialSecurityNumber() + "\n" +
                "Gross Sales = " + grossSales + "\n" +
                "Commission Rate = " + commissionRate + "\n" +
                "Total salary = " + getPayment()+ "\n" +
                "========================================================";
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }
}
