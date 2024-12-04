package problemfour;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Base Plus Commission Employee --> \n" +
                "First name = " + getFirstName() + "\n" +
                "Last name = " + getLastName() + "\n" +
                "SSN = " + getSocialSecurityNumber() + "\n" +
                "Base Salary = " + baseSalary + "\n"+
                "Gross Sale = " + getGrossSales() + "\n" +
                "Commission rate = " + getCommissionRate() +"\n" +
                "Total salary = " + getPayment() + "\n" +
                "========================================================";
    }

    @Override
    double getPayment() {
        return baseSalary + super.getPayment();
    }
}
