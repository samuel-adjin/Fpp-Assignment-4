package problemfour;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "Salary Employee --> \n" +
                "First name = " + getFirstName() + "\n" +
                "Last name = " + getLastName() + "\n" +
                "SSN = " + getSocialSecurityNumber() + "\n" +
                "weeklySalary = " + weeklySalary + "\n" +
                "Total salary = " + getPayment() + "\n" +
                "========================================================";
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }
}
